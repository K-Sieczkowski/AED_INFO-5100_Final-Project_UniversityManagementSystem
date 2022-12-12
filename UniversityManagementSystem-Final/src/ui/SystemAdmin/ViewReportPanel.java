/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.SystemAdmin;

import Business.EcoSystem;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author ksiec
 */
public class ViewReportPanel extends javax.swing.JPanel {
private JPanel userProcessContainer;
private EcoSystem ecosystem;
    
    /**
     * Creates new form ViewReportPanel
     */
    public ViewReportPanel(JPanel userProcessContainer, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        panelChart = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));
        setMinimumSize(new java.awt.Dimension(1050, 850));

        jButton1.setText("View Top Requests By Type");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        panelChart.setLayout(new java.awt.BorderLayout());

        jButton2.setText("View Top Emergency Requests");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("View Top Requests by Network");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelChart, javax.swing.GroupLayout.PREFERRED_SIZE, 988, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(174, 174, 174)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addComponent(panelChart, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        DefaultCategoryDataset barChartData = new DefaultCategoryDataset();
        
        barChartData.setValue(12, "Number of Requests", "Advising Requests");
        barChartData.setValue(4, "Number of Requests", "Community Requests");
        barChartData.setValue(5, "Number of Requests", "Emergency Requests");
        barChartData.setValue(7, "Number of Requests", "Health Requests");
        barChartData.setValue(9, "Number of Requests", "Housing Requests");
        
        JFreeChart chart = ChartFactory.createBarChart("Top Requests By Type", "Request Type", "Number of Requests", barChartData, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot barChart = chart.getCategoryPlot();
        barChart.setRangeGridlinePaint(Color.BLUE);
        
        ChartPanel barPanel = new ChartPanel(chart);
        panelChart.removeAll();
        panelChart.add(barPanel, BorderLayout.CENTER);
        panelChart.validate();
        
    
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultPieDataset pieChartData = new DefaultPieDataset();
        
        pieChartData.setValue("Police Department Type", 68);
        pieChartData.setValue("Fire Department Type", 32);
        
        JFreeChart pieChart = ChartFactory.createPieChart("Report of Emergency Requests for Boston", pieChartData, true, true, false);
        
        ChartPanel piePanel = new ChartPanel(pieChart);
        panelChart.removeAll();
        panelChart.add(piePanel, BorderLayout.CENTER);
        panelChart.validate();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    DefaultCategoryDataset barChartData1 = new DefaultCategoryDataset();
     
    barChartData1.setValue(12, "Boston", "Advising Requests");
    barChartData1.setValue(4, "Boston", "Community Requests");
    barChartData1.setValue(5, "Boston", "Emergency Requests");
    barChartData1.setValue(7, "Boston", "Health Requests");
    barChartData1.setValue(9, "Boston", "Housing Requests");
        
    
    JFreeChart jchart = ChartFactory.createBarChart("Top Requests By Network", "Networks", "Number of Requests", barChartData1, PlotOrientation.VERTICAL, true, true, false);
    CategoryPlot plot = jchart.getCategoryPlot();
    plot.setRangeGridlinePaint(Color.BLACK);  
    
    barChartData1.setValue(6, "Silicon Valley", "Advising Requests");
    barChartData1.setValue(13, "Silicon Valley", "Community Requests");
    barChartData1.setValue(8, "Silicon Valley", "Emergency Requests");
    barChartData1.setValue(14, "Silicon Valley", "Health Requests");
    barChartData1.setValue(5, "Silicon Valley", "Housing Requests");
     
    CategoryPlot plot2 = jchart.getCategoryPlot();
    plot2.setRangeGridlinePaint(Color.BLACK);
    
    ChartPanel barPanel = new ChartPanel(jchart);
    panelChart.removeAll();
    panelChart.add(barPanel, BorderLayout.CENTER);
    panelChart.validate();
    
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel panelChart;
    // End of variables declaration//GEN-END:variables
}

