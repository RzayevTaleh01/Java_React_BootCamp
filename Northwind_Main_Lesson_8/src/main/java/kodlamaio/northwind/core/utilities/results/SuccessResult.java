package kodlamaio.northwind.core.utilities.results;

public class SuccessResult extends Result {

	public SuccessResult() {
		super(true);

	}

	public SuccessResult(String message) {
		super(true, message);

	}

}

// Sadece  Result ve DataResult sınıflarıyla çalışılabilir fakat 
// True mu false mi uğraşmak istemiyoruz
// SuccessResult çalışırsa true ErrorResult çalışırsa false demek