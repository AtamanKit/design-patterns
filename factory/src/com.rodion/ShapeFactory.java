package com.rodion;

// Product Interface
interface Button {
    void render();
}

// Concrete Product
class WindowsButton implements Button {
    public void render() {
        System.out.println("Rendering Windows Button.");
    }
}

class HTMLButton implements Button {
    public void render() {
        System.out.println("Rendering HTML Button.");
    }
}

// Creator Class
abstract class Dialog {
    abstract Button createButton();
    void render() {
        Button okButton = createButton();
        okButton.render();
    }
}

// Concrete Creators
class WindowDialog extends Dialog {
    Button createButton() {
        return new WindowsButton();
    }
}

class WebDialog extends Dialog {
    Button createButton() {
        return new HTMLButton();
    }
}