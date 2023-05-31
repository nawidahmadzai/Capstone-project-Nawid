package tek.capstone.dragons.pages;

public class POMFactory  {
	private HomePage homePage;
	private SignInPage signInPage;
	private OrderPage orderPage;
	private AccountPage accountPage;
	public POMFactory() {
		this.homePage = new HomePage();
		this.signInPage = new SignInPage();
		this.orderPage = new OrderPage();
		this.accountPage = new AccountPage();
	}
	public SignInPage signInPage() {
		return this.signInPage;
	}
	public OrderPage orderPage() {
		return this.orderPage;
	}
	public AccountPage accountPage() {
		return this.accountPage;
	}
	public HomePage homePage() {
		return this.homePage;
	}
}
