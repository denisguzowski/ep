package model.entity.symbol;

public class Letter extends Symbol{
    private Case aCase;

    public Letter(Character character) {
        super(character);
        setCase(character);
    }

    @Override
    public void setCharacter(Character character) {
        super.setCharacter(character);
        setCase(character);
    }

    public boolean isUpperCase() {
        return (aCase == Case.UPPER);
    }

    public void changeCase(){
        if(isUpperCase()){
            super.setCharacter(Character.toLowerCase(super.getCharacter()));
            aCase = Case.LOWER;
        }else{
            super.setCharacter(Character.toUpperCase(super.getCharacter()));
            aCase = Case.UPPER;
        }
    }

    private void setCase(Character character){
        if(Character.isUpperCase(character)){
            aCase = Case.UPPER;
        }else{
            aCase = Case.LOWER;
        }
    }

    private enum Case{UPPER, LOWER}
}

