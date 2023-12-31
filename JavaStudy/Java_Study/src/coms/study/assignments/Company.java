package coms.study.assignments;

public class Company {
	private String category; // 종류
	private String name; // 이름
	private double revenue; // 매출
	private double profit; // 순이익
	private String mainProduct; // 주력상품
	private String bestSellingProduct; // 제일 잘 나가는 상품
	private String foundingDate; // 창립일자
	private int totalProductCount; // 상품 총 개수

	public Company(int category, String name, double revenue, double profit, String mainProduct,
			String bestSellingProduct, String foundingDate, int totalProductCount) {
		companyCategory(category);
		this.name = name;
		this.revenue = revenue;
		this.profit = profit;
		this.mainProduct = mainProduct;
		this.bestSellingProduct = bestSellingProduct;
		this.foundingDate = foundingDate;
		this.totalProductCount = totalProductCount;
	}

	void companyCategory(int category) { // 생성자 정수값에 따라 다른 종류 초기화
		if (category == 1) {
			this.category = "개인브랜드";
		}
		if (category == 2) {
			this.category = "네이버샵";
		}
		if (category == 3) {
			this.category = "백화점";
		}
		if (category == 4) {
			this.category = "이커머스";
		}
		if (category == 5) {
			this.category = "기타";
		}
	}

	// get 함수
	public String getCategory() {
		return this.category;
	}

	public String getName() {
		return this.name;
	}

	public double getRevenue() {
		return this.revenue;
	}

	public double getProfit() {
		return this.profit;
	}

	public String getMainProduct() {
		return this.mainProduct;
	}

	public String getBestSellingProduct() {
		return this.bestSellingProduct;
	}

	public String getFoundingDate() {
		return this.foundingDate;
	}

	public int getTotalProductCount() {
		return this.totalProductCount;
	}

	// 증감연산자로 상품 수량 조절
	public void AddProductCount(int howMany) {
		this.totalProductCount += howMany;
	}

	public void SubProductCount(int howMany) {
		this.totalProductCount -= howMany;
		if (totalProductCount <= 0) {
			System.out.println("상품 개수가 더이상 남지 않았습니다 ");
			return;
		}
	}

}
