package tw.luna.pretty;

import javax.swing.*;
import java.awt.*;
import java.time.LocalTime;

/**
 * AnalogClock 類表示一個模擬時鐘面板
 * 繼承自 JPanel，可以直接添加到 Swing 容器中
 */
public class AnalogClock extends JPanel {
    // 常量定義
    private static final int TIMER_DELAY = 1000; // 定時器延遲，單位為毫秒
    private static final int CLOCK_PADDING = 10; // 時鐘邊框內邊距
    private static final int HOURS_IN_CLOCK = 12; // 時鐘上的小時數
    private static final double DEGREES_PER_HOUR = 360.0 / HOURS_IN_CLOCK; // 每小時的角度
    private static final double DEGREES_PER_MINUTE = 360.0 / 60; // 每分鐘的角度
    private static final double DEGREES_PER_SECOND = 360.0 / 60; // 每秒鐘的角度

    // 時鐘中心坐標和半徑
    private int centerX, centerY, radius;

    /**
     * 構造函數
     * 初始化時鐘並啟動定時器以更新顯示
     */
    public AnalogClock() {
        // 創建一個定時器，每秒觸發一次重繪
        Timer timer = new Timer(TIMER_DELAY, e -> repaint());
        timer.start(); // 啟動定時器
    }

    /**
     * 重寫 paintComponent 方法以自定義繪製
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // 調用父類方法以確保正確的繪製行為
        Graphics2D g2d = (Graphics2D) g; // 轉換為 Graphics2D 以使用更多繪圖功能
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); // 啟用抗鋸齒

        calculateDimensions(); // 計算時鐘尺寸
        drawClockFace(g2d); // 繪製時鐘面盤
        drawClockHands(g2d); // 繪製時鐘指針
    }

    /**
     * 計算時鐘的尺寸和位置
     */
    private void calculateDimensions() {
        int size = Math.min(getWidth(), getHeight()); // 取寬高中的較小值作為時鐘大小
        centerX = getWidth() / 2; // 計算中心 X 坐標
        centerY = getHeight() / 2; // 計算中心 Y 坐標
        radius = size / 2 - CLOCK_PADDING; // 計算時鐘半徑，考慮內邊距
    }

    /**
     * 繪製時鐘面盤
     */
    private void drawClockFace(Graphics2D g2d) {
        g2d.setColor(Color.BLACK);
        // 繪製時鐘外圓
        g2d.drawOval(centerX - radius, centerY - radius, 2 * radius, 2 * radius);

        // 繪製小時刻度
        for (int hour = 1; hour <= HOURS_IN_CLOCK; hour++) {
            double angle = Math.toRadians(hour * DEGREES_PER_HOUR - 90); // 計算每個小時的角度，-90 是為了從 12 點鐘位置開始
            int x = (int) (centerX + Math.cos(angle) * (radius - 20)); // 計算 X 坐標
            int y = (int) (centerY + Math.sin(angle) * (radius - 20)); // 計算 Y 坐標
            g2d.drawString(String.valueOf(hour), x - 5, y + 5); // 繪製小時數字
        }
    }

    /**
     * 繪製時鐘指針
     */
    private void drawClockHands(Graphics2D g2d) {
        LocalTime now = LocalTime.now(); // 獲取當前時間
        int hour = now.getHour();
        int minute = now.getMinute();
        int second = now.getSecond();

        // 繪製時針
        drawHand(g2d, (hour % 12 + minute / 60.0) * DEGREES_PER_HOUR, radius * 0.5, 3, Color.BLACK);
        // 繪製分針
        drawHand(g2d, minute * DEGREES_PER_MINUTE, radius * 0.7, 2, Color.BLACK);
        // 繪製秒針
        drawHand(g2d, second * DEGREES_PER_SECOND, radius * 0.9, 1, Color.RED);
    }

    /**
     * 繪製時鐘指針
     * @param g2d Graphics2D 對象
     * @param angle 指針角度
     * @param length 指針長度
     * @param thickness 指針粗細
     * @param color 指針顏色
     */
    private void drawHand(Graphics2D g2d, double angle, double length, int thickness, Color color) {
        g2d.setColor(color);
        g2d.setStroke(new BasicStroke(thickness)); // 設置線條粗細
        double radian = Math.toRadians(angle - 90); // 將角度轉換為弧度，-90 是為了從 12 點鐘位置開始
        int x = (int) (centerX + Math.cos(radian) * length); // 計算指針終點 X 坐標
        int y = (int) (centerY + Math.sin(radian) * length); // 計算指針終點 Y 坐標
        g2d.drawLine(centerX, centerY, x, y); // 繪製指針
    }

    /**
     * 主方法，程序入口點
     */
    public static void main(String[] args) {
        // 在 EDT (Event Dispatch Thread) 上創建和顯示 GUI
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Analog Clock");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 設置關閉行為
            frame.add(new AnalogClock()); // 添加時鐘面板到框架
            frame.setSize(400, 400); // 設置窗口大小
            frame.setLocationRelativeTo(null); // 使窗口在屏幕中央顯示
            frame.setVisible(true); // 顯示窗口
        });
    }
}