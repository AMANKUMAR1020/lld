package BehaviourDesignPattern.MementoPattern.Solution;

public class TextEditorMain {

    public TextEditorMain(){
        System.out.println("This is TextEditorMain Constructor");
    }

    public void execute() {
        TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker(); //History / StateMgmt

        editor.write("A");
        caretaker.saveState(editor);

        editor.write("B");
        caretaker.saveState(editor);
        //Problem - > Undo the last write!

        editor.write("C");
        caretaker.saveState(editor);

        System.out.println(editor.getContent());

        //CareTaker Undo
        caretaker.undo(editor);

        System.out.println(editor.getContent());
    }
}