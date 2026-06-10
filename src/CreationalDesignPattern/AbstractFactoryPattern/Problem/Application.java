package CreationalDesignPattern.AbstractFactoryPattern.Problem;

//Windows UI Components

class WindowsButton{
    public void render(){
        System.out.println("Rendering windows button");
    }
}
class WindowsScrollBar{
    public void render(){
        System.out.println("Rendering windows scrollbar");
    }
}

//Mac UI components
class MacOSButton{
    public void render(){
        System.out.println("Rendering MacOS button");
    }
}
class MacOSScrollBar{
    public void render(){
        System.out.println("Rendering MacOS scrollbar");
    }
}


public class Application {
    public Application(){
        System.out.println("This is Application Constructor");
    }

    public void execute() {
        //Windows UI
        WindowsButton button = new WindowsButton();
        WindowsScrollBar scrollBar = new WindowsScrollBar();
        //Mac UI
        button.render();
        scrollBar.render();
    }
}