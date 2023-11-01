package coms.study.assignments;

public class Company_Runner {
	public static void main(String[] args) {

		// 객체 생성
		Company myCompany = new Company(2, "DesignA", 5000000, 1000000, "의류", "베스트셀러 티셔츠", "2023-09-29", 200000);

		// 객체 속성 출력
		System.out.println("회사 종류: " + myCompany.getCategory());
		System.out.println("회사 이름: " + myCompany.getName());
		System.out.println("회사 매출: " + myCompany.getRevenue());
		System.out.println("회사 순이익: " + myCompany.getProfit());
		System.out.println("회사 주력상품: " + myCompany.getMainProduct());
		System.out.println("회사 제일 잘 나가는 상품: " + myCompany.getBestSellingProduct());
		System.out.println("회사 창립일자: " + myCompany.getFoundingDate());
		System.out.println("회사 상품 총 개수 : " + myCompany.getTotalProductCount());

		// 증감연산자로 상품 수량 조절
		myCompany.AddProductCount(100);
		System.out.println("상품 수량 변화 : " + myCompany.getTotalProductCount());
		myCompany.SubProductCount(200190);
		System.out.println("상품 수량 변화 : " + myCompany.getTotalProductCount());
	}

}
