package domain;

/**
 * Клас, що описує Тихохода, успадковуючи базові риси тварини
 */
public class Tardigrade extends Animal {

    private boolean isCryptobiosis = false;

    public Tardigrade(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Tardigrade() {
        this("Мікро-герой", 1);
    }

    @Override
    public void eat() {
        if (isCryptobiosis) {
            System.out.println("Тихоход " + name + " в анабіозі і не може їсти.");
        } else {
            System.out.println("Тихоход " + name + " повільно всмоктує поживні речовини.");
        }
    }

    @Override
    public void speak() {
        System.out.println("Тихоход " + name + " видає ультразвукові вібрації.");
    }

    public void enterCryptobiosis() {
        this.isCryptobiosis = true;
        System.out.println(name + " входить у стан криптобіозу для виживання.");
    }

    @Override
    public String toString() {
        return super.toString() + "\nСтан анабіозу: " + (isCryptobiosis ? "Так" : "Ні");
    }
}