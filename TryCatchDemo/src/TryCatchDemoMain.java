import com.autoclosable.myAutoClosable;
import com.difftrycatch.Trycatch;
import com.insuffbal.InsufficientBalanceException;

public class TryCatchDemoMain {
    public static int MIN_BAL  = 5000;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Trycatch t = new Trycatch();
		//t.test();
		try(myAutoClosable my = new myAutoClosable()){
			my.open();
			//withDaraw(6000);
		}catch(InsufficientBalanceException e){
			e.msg();
		}

	}
	
	public static void withDaraw(int amt) throws InsufficientBalanceException{
		if(amt > MIN_BAL){
			throw new InsufficientBalanceException("NOT SUFFICIENT BALANCE");
		}
	}

}
