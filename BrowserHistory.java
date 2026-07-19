import java.util.Stack;

public class BrowserHistory {
  Stack<String> browser = new Stack<>();

  //visitPage(String url)
  public void visitPage(String url){
    browser.push(url);
  }

  //goBack()
  public void goBack(){
    browser.pop();
  }

  //getCurrentPage()
  public void getCurrentPage(){
    System.out.println(browser.peek());
  }
  //printHistory()
  public void printHistory(){
    System.out.println(browser);
  }

  public static void main(String[] args){
    BrowserHistory browserHistory = new BrowserHistory();
    browserHistory.visitPage("www.youtube.com");
    browserHistory.visitPage("www.nasa.com");
    browserHistory.visitPage("www.google.com");

    browserHistory.goBack();
    browserHistory.goBack();
    browserHistory.getCurrentPage();

    browserHistory.printHistory();
  }
}
