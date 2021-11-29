package jp.co.internous.nova.model.domain.dto;

/**
 * 購入履歴画面に表示するためのDTO
 * @author 0112kaneko
 *
 */
public class PurchaseHistoryDto {
	private String purchasedAt;
	private String productName;
	private int price;
	private int productCount;
	private String familyName;
	private String firstName;
	private String address;
	
	/**
	 * 購入日時を取得する
	 * @return 購入日時
	 */
	public String getPurchasedAt() {
		return purchasedAt;
	}
	
	/**
	 * 購入日時を設定する
	 * @param purchasedAt 購入日時
	 */
	public void setPurchasedAt(String purchasedAt) {
		this.purchasedAt = purchasedAt;
	}
	
	/**
	 * 商品名を取得する
	 * @return 商品名
	 */
	public String getProductName() {
		return productName;
	}
	
	/**
	 * 商品名を設定する
	 * @param productName 商品名
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	/**
	 * 価格を取得する
	 * @return 価格
	 */
	public int getPrice() {
		return price;
	}
	
	/**
	 * 価格を設定する
	 * @param price 価格
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	
	/**
	 * 個数を取得する
	 * @return 個数
	 */
	public int getProductCount() {
		return productCount;
	}
	
	/**
	 * 個数を設定する
	 * @param productCount 個数
	 */
	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}
	
	/**
	 * 宛先姓を取得する
	 * @return 宛先姓
	 */
	public String getFamilyName() {
		return familyName;
	}
	
	/**
	 * 宛先姓を設定する
	 * @param familyName 宛先姓
	 */
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	
	/**
	 * 宛先名を取得する
	 * @return 宛先名
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * 宛先名を設定する
	 * @param firstName 宛先名
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * 住所を取得する
	 * @return 住所
	 */
	public String getAddress() {
		return address;
	}
	
	/**
	 * 住所を設定する
	 * @param address 住所
	 */
	public void setAddress(String address) {
		this.address = address;
	}
}