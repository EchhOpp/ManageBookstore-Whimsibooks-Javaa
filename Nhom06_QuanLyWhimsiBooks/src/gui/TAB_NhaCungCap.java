/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;

import bus.NhaCungCap_BUS;
import entities.NhaCungCap;


/**
 *
 * @author NguyenThanhLuan
 */
public class TAB_NhaCungCap extends javax.swing.JPanel {
	TAB_BanPhim banPhim;
	Component oldCom;
    private DefaultTableModel tableModel;
    private ArrayList<NhaCungCap> danhSachNCC;
    private NhaCungCap_BUS nhaCungCap_BUS;
    /**
     * Creates new form TAB_NhaCungCap
     */
    public TAB_NhaCungCap() {
        initComponents();
        banPhim = new TAB_BanPhim();
        nhaCungCap_BUS = new NhaCungCap_BUS();
        txtMaNhaCungCap.setText(phatSinhMaNhaCungCap());
        loadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_ALL = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        jPanel4 = new javax.swing.JPanel();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        jPanel5 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtMaNhaCungCap = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtTenNCC = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtSdtNCC = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtEmailNCC = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtTimKiemIDNCC = new javax.swing.JTextField();
        jPanel17 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtTimKiemSdtNCC = new javax.swing.JTextField();
        jPanel18 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtTimKiemTenNCC = new javax.swing.JTextField();
        jPanel19 = new javax.swing.JPanel();
        TBTimKiem = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        btnTimKiemNCC = new javax.swing.JButton();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        jPanel3 = new javax.swing.JPanel();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        jPanel12 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableNCC = new javax.swing.JTable();
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        pnlBtn = new javax.swing.JPanel();
        pnlBtnChucNang = new javax.swing.JPanel();
        btnThemNhaCungCap = new javax.swing.JButton();
        btnCapNhatNCC = new javax.swing.JButton();
        btnNhapNhieuNCC = new javax.swing.JButton();
        btnXuatFileNCC = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnHuyNhap = new javax.swing.JButton();
        btnHuyNCC = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));

        setLayout(new java.awt.BorderLayout());

        pnl_ALL.setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new java.awt.BorderLayout(10, 0));

        title.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(15, 145, 239));
        jLabel1.setText("Quản lý nhà cung cấp");
        title.add(jLabel1);
        title.add(filler1);

        jPanel1.add(title, java.awt.BorderLayout.NORTH);

        jPanel4.setPreferredSize(new java.awt.Dimension(706, 200));
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.X_AXIS));
        jPanel4.add(filler3);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(15, 145, 239)), "Nhập thông tin nhà cung cấp"));
        jPanel5.setPreferredSize(new java.awt.Dimension(617, 180));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel15.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 1, 1, 1));
        jPanel15.setLayout(new java.awt.GridLayout(4, 2, 18, 18));

        jPanel11.setLayout(new javax.swing.BoxLayout(jPanel11, javax.swing.BoxLayout.LINE_AXIS));

        jLabel6.setText(" Mã nhà cung cấp:");
        jLabel6.setPreferredSize(new java.awt.Dimension(120, 16));
        jPanel11.add(jLabel6);

        txtMaNhaCungCap.setEditable(false);
        jPanel11.add(txtMaNhaCungCap);

        jPanel15.add(jPanel11);

        jPanel10.setLayout(new javax.swing.BoxLayout(jPanel10, javax.swing.BoxLayout.LINE_AXIS));

        jLabel9.setText("Tên:");
        jLabel9.setPreferredSize(new java.awt.Dimension(80, 16));
        jPanel10.add(jLabel9);

        txtTenNCC.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel10.add(txtTenNCC);

        jPanel15.add(jPanel10);

        jPanel7.setLayout(new javax.swing.BoxLayout(jPanel7, javax.swing.BoxLayout.LINE_AXIS));

        jLabel7.setText(" Số điện thoại:");
        jLabel7.setPreferredSize(new java.awt.Dimension(120, 16));
        jPanel7.add(jLabel7);
        jPanel7.add(txtSdtNCC);

        jPanel15.add(jPanel7);

        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        jLabel10.setText("Email:");
        jLabel10.setPreferredSize(new java.awt.Dimension(80, 16));
        jPanel2.add(jLabel10);
        jPanel2.add(txtEmailNCC);

        jPanel15.add(jPanel2);

        jPanel8.setLayout(new javax.swing.BoxLayout(jPanel8, javax.swing.BoxLayout.LINE_AXIS));

        jLabel8.setText(" Địa chỉ:");
        jLabel8.setPreferredSize(new java.awt.Dimension(120, 16));
        jPanel8.add(jLabel8);
        jPanel8.add(txtDiaChi);

        jPanel15.add(jPanel8);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 387, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        jPanel15.add(jPanel9);

        jPanel5.add(jPanel15, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel5);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(15, 145, 239)), "Tìm kiếm"));
        jPanel6.setPreferredSize(new java.awt.Dimension(200, 100));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel20.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8));
        jPanel20.setLayout(new java.awt.GridLayout(4, 0, 0, 10));

        jPanel16.setLayout(new javax.swing.BoxLayout(jPanel16, javax.swing.BoxLayout.LINE_AXIS));

        jLabel2.setText(" Mã nhà cung cấp:");
        jLabel2.setPreferredSize(new java.awt.Dimension(110, 16));
        jPanel16.add(jLabel2);

        txtTimKiemIDNCC.setPreferredSize(new java.awt.Dimension(80, 22));
        jPanel16.add(txtTimKiemIDNCC);

        jPanel20.add(jPanel16);

        jPanel17.setLayout(new javax.swing.BoxLayout(jPanel17, javax.swing.BoxLayout.LINE_AXIS));

        jLabel3.setText(" Số điện thoại:");
        jLabel3.setPreferredSize(new java.awt.Dimension(110, 16));
        jPanel17.add(jLabel3);
        jPanel17.add(txtTimKiemSdtNCC);

        jPanel20.add(jPanel17);

        jPanel18.setLayout(new javax.swing.BoxLayout(jPanel18, javax.swing.BoxLayout.LINE_AXIS));

        jLabel4.setText(" Tên:");
        jLabel4.setPreferredSize(new java.awt.Dimension(110, 16));
        jPanel18.add(jLabel4);
        jPanel18.add(txtTimKiemTenNCC);

        jPanel20.add(jPanel18);

        jPanel19.setLayout(new java.awt.GridLayout(1, 0, 20, 0));

        TBTimKiem.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        TBTimKiem.setForeground(new java.awt.Color(255, 102, 102));
        jPanel19.add(TBTimKiem);

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        jPanel19.add(jPanel21);

        btnTimKiemNCC.setBackground(new java.awt.Color(15, 145, 239));
        btnTimKiemNCC.setForeground(new java.awt.Color(15, 145, 239));
        btnTimKiemNCC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/icon-search.png"))); // NOI18N
        btnTimKiemNCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemNCCActionPerformed(evt);
            }
        });
        jPanel19.add(btnTimKiemNCC);

        jPanel20.add(jPanel19);

        jPanel6.add(jPanel20, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel6);
        jPanel4.add(filler2);

        jPanel1.add(jPanel4, java.awt.BorderLayout.CENTER);
        jPanel4.getAccessibleContext().setAccessibleDescription("");

        pnl_ALL.add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));
        jPanel3.add(filler4);

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(15, 145, 239)), "Thông tin nhà cung cấp"));
        jPanel12.setLayout(new javax.swing.BoxLayout(jPanel12, javax.swing.BoxLayout.LINE_AXIS));

        tableNCC.setModel(tableModel = new DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã nhà cung cấp", "Tên nhà cung cấp", "Số điện thoại", "Email", "Địa chỉ"
            }
        ));
        tableNCC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableNCCMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableNCC);

        jPanel12.add(jScrollPane1);
        jPanel12.add(filler6);

        jPanel3.add(jPanel12);

        pnlBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(7, 4, 1, 4));
        pnlBtn.setPreferredSize(new java.awt.Dimension(50, 137));
        pnlBtn.setLayout(new javax.swing.BoxLayout(pnlBtn, javax.swing.BoxLayout.PAGE_AXIS));

        pnlBtnChucNang.setPreferredSize(new java.awt.Dimension(169, 185));
        pnlBtnChucNang.setLayout(new java.awt.GridLayout(4, 1, 0, 16));

        btnThemNhaCungCap.setBackground(new java.awt.Color(85, 182, 83));
        btnThemNhaCungCap.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThemNhaCungCap.setForeground(new java.awt.Color(255, 255, 255));
        btnThemNhaCungCap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/icon-add.png"))); // NOI18N
        btnThemNhaCungCap.setText("Thêm nhà cung cấp");
        btnThemNhaCungCap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemNhaCungCapActionPerformed(evt);
            }
        });
        pnlBtnChucNang.add(btnThemNhaCungCap);

        btnCapNhatNCC.setBackground(new java.awt.Color(85, 182, 83));
        btnCapNhatNCC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCapNhatNCC.setForeground(new java.awt.Color(255, 255, 255));
        btnCapNhatNCC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/icon-edit.png"))); // NOI18N
        btnCapNhatNCC.setText("Cập nhật");
        btnCapNhatNCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatNCCActionPerformed(evt);
            }
        });
        pnlBtnChucNang.add(btnCapNhatNCC);

        btnNhapNhieuNCC.setBackground(new java.awt.Color(85, 182, 83));
        btnNhapNhieuNCC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNhapNhieuNCC.setForeground(new java.awt.Color(255, 255, 255));
        btnNhapNhieuNCC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/icon-import.png"))); // NOI18N
        btnNhapNhieuNCC.setText("Import");
        btnNhapNhieuNCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapNhieuNCCActionPerformed(evt);
            }
        });
        pnlBtnChucNang.add(btnNhapNhieuNCC);

        btnXuatFileNCC.setBackground(new java.awt.Color(85, 182, 83));
        btnXuatFileNCC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnXuatFileNCC.setForeground(new java.awt.Color(255, 255, 255));
        btnXuatFileNCC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/icon-export.png"))); // NOI18N
        btnXuatFileNCC.setText("Xuất file");
        btnXuatFileNCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatFileNCCActionPerformed(evt);
            }
        });
        pnlBtnChucNang.add(btnXuatFileNCC);

        pnlBtn.add(pnlBtnChucNang);

        jPanel14.setMaximumSize(new java.awt.Dimension(32767, 160));
        jPanel14.setMinimumSize(new java.awt.Dimension(178, 160));
        jPanel14.setPreferredSize(new java.awt.Dimension(179, 160));
        jPanel14.setLayout(new java.awt.GridLayout(3, 2, 4, 0));
        jPanel14.add(jLabel12);
        jPanel14.add(jLabel13);

        btnHuyNhap.setBackground(new java.awt.Color(15, 145, 239));
        btnHuyNhap.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHuyNhap.setForeground(new java.awt.Color(255, 255, 255));
        btnHuyNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/icon-removeInput.png"))); // NOI18N
        btnHuyNhap.setText("Hủy nhập");
        btnHuyNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyNhapActionPerformed(evt);
            }
        });
        jPanel14.add(btnHuyNhap);

        btnHuyNCC.setBackground(new java.awt.Color(230, 159, 160));
        btnHuyNCC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHuyNCC.setForeground(new java.awt.Color(255, 255, 255));
        btnHuyNCC.setText("Hủy");
        btnHuyNCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyNCCActionPerformed(evt);
            }
        });
        jPanel14.add(btnHuyNCC);
        jPanel14.add(jLabel11);

        pnlBtn.add(jPanel14);

        jPanel3.add(pnlBtn);
        jPanel3.add(filler5);

        pnl_ALL.add(jPanel3, java.awt.BorderLayout.CENTER);

        add(pnl_ALL, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSdtNCCActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }            
    
    private boolean kiemTraDuLieuKhiTimKiem() {
    	String timKiemTheoMa = txtTimKiemIDNCC.getText().trim();
    	String timKiemTheoSDT = txtTimKiemSdtNCC.getText().trim();
    	String timKiemTheoTen = txtTimKiemTenNCC.getText().trim();
    	if(timKiemTheoMa.length() <= 0 && timKiemTheoSDT.length() <= 0 && timKiemTheoTen.length() <= 0) {
    		TBTimKiem.setText("* Chưa có dữ liệu");
    		return false;
    	}
    	return true;
    }
    
    private void timKiem() {
    	String timKiemTheoMa = txtTimKiemIDNCC.getText().trim();
    	String timKiemTheoSDT = txtTimKiemSdtNCC.getText().trim();
    	String timKiemTheoTen = txtTimKiemTenNCC.getText().trim();
    	ArrayList<NhaCungCap> danhSachNCCTimKiem = new ArrayList<NhaCungCap>();
    	tableNCC.removeAll();
    	tableModel.setRowCount(0);
    	TBTimKiem.setText("");
    	
    	if(timKiemTheoMa.length() > 0) {
    		for(NhaCungCap nhaCungCap : danhSachNCC) {
    			if(nhaCungCap.getNhaCungCapID().contains(timKiemTheoMa))
    				danhSachNCCTimKiem.add(nhaCungCap);
    		}
    	}
    	if(timKiemTheoSDT.length() > 0) {
    		for(NhaCungCap nhaCungCap : danhSachNCC) {
    			if(nhaCungCap.getSoDienThoai().contains(timKiemTheoSDT))
    				danhSachNCCTimKiem.add(nhaCungCap);
    		}
    		if(timKiemTheoMa.length() > 0) {
    			danhSachNCCTimKiem.clear();
        		for(NhaCungCap nhaCungCap : danhSachNCC) {
        			if(nhaCungCap.getSoDienThoai().contains(timKiemTheoSDT) && nhaCungCap.getNhaCungCapID().contains(timKiemTheoMa))
        				danhSachNCCTimKiem.add(nhaCungCap);
        		}
    		}
    	}
    	int stt = 1;
    	for(NhaCungCap nhaCungCap : danhSachNCCTimKiem) {
    		tableModel.addRow(new Object[] {stt++, nhaCungCap.getNhaCungCapID(), nhaCungCap.getTenNhaCungCap(), nhaCungCap.getSoDienThoai(), nhaCungCap.getEmail(), nhaCungCap.getDiaChi()});
    	}
    }
    
    // Sự kiện nhấn btn
    private void btnTimKiemNCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemNCCActionPerformed
       if(kiemTraDuLieuKhiTimKiem()) {
    	   timKiem();
       }
    }//GEN-LAST:event_btnTimKiemNCCActionPerformed

    private void tableNCCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableNCCMouseClicked
        int row = tableNCC.getSelectedRow();
        if(row != -1) {
        	txtMaNhaCungCap.setText(tableModel.getValueAt(row, 1).toString());
        	txtTenNCC.setText(tableModel.getValueAt(row, 2).toString());
        	txtSdtNCC.setText(tableModel.getValueAt(row, 3).toString());
        	txtEmailNCC.setText(tableModel.getValueAt(row, 4).toString());
        	txtDiaChi.setText(tableModel.getValueAt(row, 5).toString());
        }
    }//GEN-LAST:event_tableNCCMouseClicked
    private void Huy() {
        txtTenNCC.setText("");
        txtSdtNCC.setText("");
        txtEmailNCC.setText("");
        txtDiaChi.setText("");
        txtTimKiemIDNCC.setText("");
        txtTimKiemSdtNCC.setText("");
        txtTimKiemTenNCC.setText("");
        loadData();
    }
    
    private void btnHuyNCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyNCCActionPerformed
    	Huy();
    }//GEN-LAST:event_btnHuyNCCActionPerformed
    
    private void btnXuatFileNCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatFileNCCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXuatFileNCCActionPerformed

    private void btnNhapNhieuNCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapNhieuNCCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNhapNhieuNCCActionPerformed
    

    private void btnCapNhatNCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatNCCActionPerformed
        try {
        	if(kiemTraDuLieuEdit()) {
        		String maNCC = txtMaNhaCungCap.getText();
            	String hoTenNCC = txtTenNCC.getText();
    	    	String soDienThoai = txtSdtNCC.getText();
    	    	String email = txtEmailNCC.getText();
    	    	String diaChi = txtDiaChi.getText();
    	    	NhaCungCap nhaCungCap = new NhaCungCap(maNCC, hoTenNCC, soDienThoai, email, diaChi);
    	    	if (nhaCungCap_BUS.editNhaCungCap(nhaCungCap)) {
    				JOptionPane.showMessageDialog(this, "Cập nhật thành công");
    				txtMaNhaCungCap.setText(phatSinhMaNhaCungCap());
    				Huy();
    				loadData();
    			}
        	}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Lỗi dữ liệu");
			return;
		}
    }//GEN-LAST:event_btnCapNhatNCCActionPerformed

    
    // Them nha cung cap
    	// Phat sinh ma tu dong
    private String phatSinhMaNhaCungCap() {
		try {
			String maNhaCungCap = "NCC" + String.format("%05d", nhaCungCap_BUS.layMaNCCCuoiCung() + 1);
			return maNhaCungCap;
		} catch (NullPointerException e) {
			return "NCC" + "00001";
		}
	}
    
    private void btnThemNhaCungCapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemNhaCungCapActionPerformed
        try {
			if(kiemTraDuLieu()) {
				String hoTenNCC = txtTenNCC.getText();
		    	String soDienThoai = txtSdtNCC.getText();
		    	String email = txtEmailNCC.getText();
		    	String diaChi = txtDiaChi.getText();
		    	NhaCungCap nhaCungCap = new NhaCungCap(phatSinhMaNhaCungCap(), hoTenNCC, soDienThoai, email, diaChi);
		    	if (nhaCungCap_BUS.addNhaCungCap(nhaCungCap)) {
					JOptionPane.showMessageDialog(this, "Thêm thành công");
					txtMaNhaCungCap.setText(phatSinhMaNhaCungCap());
					Huy();
					loadData();
				}
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this,"Lỗi nhập dữ liệu");
			return;
		}
    }//GEN-LAST:event_btnThemNhaCungCapActionPerformed

    private void btnHuyNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyNhapActionPerformed
        txtTenNCC.setText("");
        txtSdtNCC.setText("");
        txtEmailNCC.setText("");
        txtDiaChi.setText("");
    }//GEN-LAST:event_btnHuyNhapActionPerformed
    
    // Kiểm tra dữ liệu khi thêm
    private boolean kiemTraSDT(String sdt) {
    	for(NhaCungCap nhaCungCap : danhSachNCC) {
    		if(nhaCungCap.getSoDienThoai().equals(sdt))
    			return true;
    	}
    	return false;
    }
    private boolean kiemTraEmail(String email) {
    	for(NhaCungCap nhaCungCap : danhSachNCC) {
    		if(nhaCungCap.getEmail().equals(email))
    			return true;
    	}
    	return false;
    }
    private boolean kiemTraDuLieu() {
    	String hoTenNCC = txtTenNCC.getText();
    	String soDienThoai = txtSdtNCC.getText();
    	String email = txtEmailNCC.getText();
    	String diaChi = txtDiaChi.getText();
    	if(!(hoTenNCC.length() > 0 && hoTenNCC.matches(utilities.RegexPattern.HOTEN))) {
    		new utilities.ShowMessageError().showError(this, txtTenNCC, "Tên nhà cung cấp không đúng định dạng", "Thông báo");
    		return false;
    	}
    	if(!(soDienThoai.length() > 0 && soDienThoai.matches(utilities.RegexPattern.SDTVN))) {
    		new utilities.ShowMessageError().showError(this, txtSdtNCC, "Số điện thoại không đúng định dạng", "Thông báo");
    		return false;
    	}
    	if(!(email.length() > 0 && email.matches(utilities.RegexPattern.EMAIL))) {
    		new utilities.ShowMessageError().showError(this, txtEmailNCC, "Email không đúng định dạng", "Thông báo");
    		return false;
    	}
    		
    	if(!(diaChi.length() > 0 && diaChi.matches("[a-zA-z0-9' ]+"))) {
    		new utilities.ShowMessageError().showError(this, txtDiaChi, "Địa chỉ không đúng định dạng", "Thông báo");
    		return false;
    	}
    	if(kiemTraSDT(soDienThoai) == true) {
    		new utilities.ShowMessageError().showError(this, txtSdtNCC, "Số điện thoại đã tồn tại", "Thông báo");
    		return false;
    	}
    	if(kiemTraEmail(email) == true) {
    		new utilities.ShowMessageError().showError(this, txtEmailNCC, "Email đã tồn tại", "Thông báo");
    		return false;
    	}
    	return true;
    }
    
    // Kiểm tra dữ liệu khi cập nhật
    private boolean kiemTraSDTEdit(String sdt) {
    	for(NhaCungCap nhaCungCap : danhSachNCC) {
    		if(nhaCungCap.getSoDienThoai().equals(sdt))
    			return true;
    	}
    	return false;
    }
    private boolean kiemTraEmailEdit(String email) {
    	for(NhaCungCap nhaCungCap : danhSachNCC) {
    		if(nhaCungCap.getEmail().equals(email))
    			return true;
    	}
    	return false;
    }
    private boolean kiemTraDuLieuEdit() {
    	String hoTenNCC = txtTenNCC.getText();
    	String soDienThoai = txtSdtNCC.getText();
    	String email = txtEmailNCC.getText();
    	String diaChi = txtDiaChi.getText();
    	int row = tableNCC.getSelectedRow();
    	if(!(hoTenNCC.length() > 0 && hoTenNCC.matches(utilities.RegexPattern.HOTEN))) {
    		new utilities.ShowMessageError().showError(this, txtTenNCC, "Tên nhà cung cấp không đúng định dạng", "Thông báo");
    		return false;
    	}
    	if(!(soDienThoai.length() > 0 && soDienThoai.matches(utilities.RegexPattern.SDTVN))) {
    		new utilities.ShowMessageError().showError(this, txtSdtNCC, "Số điện thoại không đúng định dạng", "Thông báo");
    		return false;
    	}
    	if(!(email.length() > 0 && email.matches(utilities.RegexPattern.EMAIL))) {
    		new utilities.ShowMessageError().showError(this, txtEmailNCC, "Email không đúng định dạng", "Thông báo");
    		return false;
    	}
    	if(!(diaChi.length() > 0 && diaChi.matches("[a-zA-z0-9' ]+"))) {
    		new utilities.ShowMessageError().showError(this, txtDiaChi, "Địa chỉ không đúng định dạng", "Thông báo");
    		return false;
    	}
    	if(kiemTraSDTEdit(soDienThoai) == true && (soDienThoai.equals(danhSachNCC.get(row).getSoDienThoai()) == false)) {
    		new utilities.ShowMessageError().showError(this, txtSdtNCC, "Số điện thoại đã tồn tại", "Thông báo");
    		return false;
    	}
    	if(kiemTraEmailEdit(email) == true  && (email.equals(danhSachNCC.get(row).getEmail()) == false)) {
    		new utilities.ShowMessageError().showError(this, txtEmailNCC, "Email đã tồn tại", "Thông báo");
    		return false;
    	}
    	return true;
    }
    
    private void loadData() {
    	tableNCC.removeAll();
    	tableNCC.setRowSelectionAllowed(false);
    	tableModel.setRowCount(0);
    	danhSachNCC = new ArrayList<>();
    	danhSachNCC = nhaCungCap_BUS.getAllNhaCungCap();
    	
    	int stt = 1;
    	for(NhaCungCap ncc : danhSachNCC) {
    		tableModel.addRow(new Object[] {stt++, ncc.getNhaCungCapID(), ncc.getTenNhaCungCap(), ncc.getSoDienThoai(), ncc.getEmail(), ncc.getDiaChi()});
    	}
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TBTimKiem;
    private javax.swing.JButton btnCapNhatNCC;
    private javax.swing.JButton btnHuyNCC;
    private javax.swing.JButton btnHuyNhap;
    private javax.swing.JButton btnNhapNhieuNCC;
    private javax.swing.JButton btnThemNhaCungCap;
    private javax.swing.JButton btnTimKiemNCC;
    private javax.swing.JButton btnXuatFileNCC;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlBtn;
    private javax.swing.JPanel pnlBtnChucNang;
    private javax.swing.JPanel pnl_ALL;
    private javax.swing.JTable tableNCC;
    private javax.swing.JPanel title;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmailNCC;
    private javax.swing.JTextField txtMaNhaCungCap;
    private javax.swing.JTextField txtSdtNCC;
    private javax.swing.JTextField txtTenNCC;
    private javax.swing.JTextField txtTimKiemIDNCC;
    private javax.swing.JTextField txtTimKiemSdtNCC;
    private javax.swing.JTextField txtTimKiemTenNCC;
    // End of variables declaration//GEN-END:variables
}
