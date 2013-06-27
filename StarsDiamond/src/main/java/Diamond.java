package main.java;

import java.util.ArrayList;
import java.util.List;

public class Diamond {

    public static final String ICON = "*";
    private static final String OFF_ICON = " ";
    public static int MAX = 12;
    public List<String> Rows = new ArrayList<String>();
    public static int SPACE_LENGTH = MAX / 2;
    public static int ICON_LENGTH = 1;

    public void visualizeDiamond() {
        for(String row : Rows) {
            System.out.println(row);
        }
    }

    public Diamond createDiamond(){
        setDiamondToOddNumber();
        createTriangle();
        inverseTriangle();
        return this;
    }

    public Diamond createDiamondWithNameInTheMiddle(){
        setDiamondToOddNumber();
        createTriangle();
        inverseTriangle();
        setMiddleRowAsName();
        return this;
    }

    private void setDiamondToOddNumber() {
        if(MAX % 2 == 0) {
            System.out.println("Sorry, had to subtract one from your entry. Diamonds must have an odd number for its max row.");
            MAX -= 1;
        }
    }

    private void inverseTriangle() {
        for(int i = Rows.size() - 2; i >= 0; i--){
            Rows.add(Rows.get(i));
        }
    }

    private void createTriangle() {
        for(; SPACE_LENGTH > 0; SPACE_LENGTH--) {
            Rows.add(createOffIconSpace() + createIconSpace() + createOffIconSpace());
            ICON_LENGTH += 2;
        }
    }

    private String createIconSpace() {
        StringBuilder iconRowBuilder = new StringBuilder();
        for(int i = ICON_LENGTH; i > 0; i--) {
            iconRowBuilder.append(ICON);
        }
        return iconRowBuilder.toString();
    }

    private String createOffIconSpace() {
        StringBuilder offIconRowBuilder = new StringBuilder();
        for(int i = SPACE_LENGTH; i > 0; i--) {
            offIconRowBuilder.append(OFF_ICON);
        }
        return offIconRowBuilder.toString();
    }

    private void setMiddleRowAsName() {
        int middleRow = Rows.size()/2;
        Rows.set(middleRow, centerName(Rows.get(middleRow).length()));
    }

    private String centerName(int rowSize) {
        String name = "Abby";
        StringBuilder nameRow = new StringBuilder();
        if(name.length() < rowSize) {
            int space = (rowSize - name.length()) / 2;
            for(; space > 0; space--) {
                nameRow.append(" ");
            }
        }
        return nameRow.append(name).toString();
    }
}