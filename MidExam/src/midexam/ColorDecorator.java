/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midexam;

/**
 *
 * @author hp
 */
class ColorDecorator extends CaseDecorator {
    private String color;

    public ColorDecorator(Case decoratedCase, String color) {
        super(decoratedCase);
        this.color = color;
    }

    @Override
    public String description() {
        return decoratedCase.description() + " in " + color + " color";
    }
}