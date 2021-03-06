/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StandardSeries.Bubbles;

import com.steema.teechart.TChart;
import com.steema.teechart.drawing.Color;
import com.steema.teechart.drawing.DashStyle;
import com.steema.teechart.drawing.StringAlignment;
import com.steema.teechart.editors.ChartEditor;
import com.steema.teechart.legend.Legend;
import com.steema.teechart.legend.LegendAdapter;
import com.steema.teechart.legend.LegendStyle;
import com.steema.teechart.legend.LegendTextStyle;
import com.steema.teechart.styles.BubbleCloud;
import com.steema.teechart.styles.PaletteStyle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author norike
 */
public class PopularCodeLanguages extends javax.swing.JPanel {

    /**
     * Creates new form PopularCodeLanguages
     */
    public PopularCodeLanguages() {
        initComponents();

        createChart();
        initChart();
        setEditor();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new java.awt.BorderLayout());
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    protected TChart tChart1;

    private void createChart() {
        tChart1 = new TChart();
        add(tChart1);
    }

    private void initChart() {        
        tChart1.getAspect().setView3D(false);
        tChart1.getPanel().getGradient().setVisible(false);
        tChart1.getPanel().setColor(Color.WHITE);
        tChart1.getFooter().setAlignment(StringAlignment.NEAR);
        tChart1.getFooter().getFont().setColor(Color.GRAY);
        tChart1.getFooter().getFont().setName("Verdana");
        tChart1.getFooter().setText("Data from @codeeval");
        tChart1.getHeader().getFont().setColor(Color.GRAY);
        tChart1.getHeader().getFont().setSize(36);
        tChart1.getHeader().getFont().setName("Segoe UI");
        tChart1.getHeader().setText("Most popular coding languages of 2014");
        tChart1.getLegend().getFont().setColor(Color.GRAY);
        tChart1.getLegend().getFont().setSize(19);
        tChart1.getLegend().getFont().setName("Verdana");
        tChart1.getLegend().getPen().setStyle(DashStyle.DOT);
        tChart1.getLegend().getShadow().setTransparency(0);
        tChart1.getLegend().setTextStyle(LegendTextStyle.PLAIN);

        BubbleCloud bCloud = new BubbleCloud(tChart1.getChart());
        bCloud.setUseColorRange(false);
        bCloud.setUsePalette(true);
        bCloud.setPaletteStyle(PaletteStyle.PALE);
        bCloud.setRotation(5);
        bCloud.setSeparation(51);
        bCloud.setSizeRatio(1.44);
        bCloud.getPen().setWidth(2);
        bCloud.getPen().setColor(Color.DARK_GRAY);
        bCloud.getPen().setStyle(DashStyle.DOT);
        bCloud.getMarks().getFont().setColor(Color.BLACK);
        bCloud.getMarks().getFont().setName("Segoe UI");

        bCloud.add(0, 1175, 30.3, "Python");
        bCloud.add(0, 1082.5, 22.2, "Java");
        bCloud.add(0, 1077.5, 13, "C++");
        bCloud.add(0, 1055, 10.6, "Ruby");
        bCloud.add(0, 1042.5, 5.2, "JavaScript");
        bCloud.add(0, 1035, 5, "C#");
        bCloud.add(0, 1035, 4.1, "C");
        bCloud.add(0, 1017.5, 3.3, "PHP");
        bCloud.add(0, 1005, 1.6, "Perl");
        bCloud.add(0, 975, 1.5, "Go");

        tChart1.setLegendResolver(new LegendAdapter() {

            @Override
            public String getItemText(Legend legend, LegendStyle legendStyle, int index, String text) {
                switch (index) {
                    case 0:
                        text += " 30,3 %";
                        break;
                    case 1:
                        text += " 22,2 %";
                        break;
                    case 2:
                        text += " 13 %";
                        break;
                    case 3:
                        text += " 10,6 %";
                        break;
                    case 4:
                        text += " 5,2 %";
                        break;
                    case 5:
                        text += " 5 %";
                        break;
                    case 6:
                        text += " 4,1 %";
                        break;
                    case 7:
                        text += " 3,3 %";
                        break;
                    case 8:
                        text += " 1,6 %";
                        break;
                    case 9:
                        text += " 1,5 %";
                        break;
                }

                return text;
            }
        });
    }

    private void setEditor() {
        tChart1.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    ChartEditor.editChart(tChart1.getChart());
                }
            }
        });
    }
}
