public class Fraction
{
    // Variable d'instances //
    private int numerateur;
    private int denominateur;
  
    public Fraction()
    {
        this.numerateur = 1;
        this.denominateur = 1;
    }

    public Fraction(int a, int b)
    {
        this.numerateur = a;
        this.denominateur = b;

        // Assertions //
        assert numerateur < 0 : "Cas erreur : le numérateur est négatif";
		assert denominateur < 0 : "Cas erreur : le dénominateur est négatif";
    }

    public int getDenominateur() 
    {
        return denominateur;
    }
    public int getNumerateur() 
    
    {
        return numerateur;
    }
    @Override
    public String toString()
    {
        String s = numerateur + " / " + denominateur;
        return s;
    }
}