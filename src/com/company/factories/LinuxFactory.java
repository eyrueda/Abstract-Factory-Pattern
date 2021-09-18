package com.company.factories;

import com.company.buttons.Button;
import com.company.buttons.LinuxButton;
import com.company.checkboxes.Checkbox;
import com.company.checkboxes.LinuxCheckbox;

public class LinuxFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LinuxCheckbox();
    }
}
