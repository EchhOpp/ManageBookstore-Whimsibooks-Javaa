package interfaces;

import java.sql.Date;
import java.util.ArrayList;

import entities.KhuyenMai;
import entities.SanPham;

public interface IKhuyenMai {
	public ArrayList<KhuyenMai> getAllKhuyenMai();
	public ArrayList<KhuyenMai> getKhuyenMaiByID(String maKhuyenMai);
	public boolean addKhuyenMai(KhuyenMai khuyenMai);
	public boolean editKhuyenMai(KhuyenMai khuyenMai);
	public ArrayList<KhuyenMai> getKhuyenMaiFollowDay(Date startDay, Date expriedDay);
}
	