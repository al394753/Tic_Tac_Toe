package Modelo.Menu.ChangeLanguage;


import Modelo.Input.Number;
import Modelo.Menu.Action;
import Modelo.Menu.Application;
import Modelo.Menu.ChangeRival.Enemy;
import Modelo.Output.Output;


public class ChangeLanguage extends Action {
    @Override
    public void doAction() {
        Output output = Application.getOutput();
        Enemy.game = game;
        MenuChangeLanguage option = null;
        while ( option == null ){
            System.out.println(MenuChangeLanguage.getMenu());
            System.out.print(output.getOption());
            int optionNumber = Number.getNumber();
            try {
                option = MenuChangeLanguage.getOption(optionNumber);
                option.doAction();
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println(output.NoAnOption());
            }
        }
    }

    @Override
    public String getTitle() {
        return Application.getOutput().OptionLanguage();
    }
}
