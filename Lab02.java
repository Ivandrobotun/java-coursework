import java.util.Locale;

/**
 * Р›Р°Р±РѕСЂР°С‚РѕСЂРЅР° СЂРѕР±РѕС‚Р° в„– 2: Р·Р°РІРґР°РЅРЅСЏ 10, 11 С– 12 (РІР°СЂС–Р°РЅС‚ 4).
 * РџРѕР·РЅР°С‡РµРЅРЅСЏ Р· РјРµС‚РѕРґРёС‡РєРё: sh(x) = sinh(x), ch(x) = cosh(x),
 * lg(x) = log10(x), ln(x) = РЅР°С‚СѓСЂР°Р»СЊРЅРёР№ Р»РѕРіР°СЂРёС„Рј.
 */
public class Lab02 {
    public static void main(String[] args) {
        System.out.printf(Locale.US, "Р—Р°РІРґР°РЅРЅСЏ 10: y = %.12f%n", task10());
        System.out.printf(Locale.US, "Р—Р°РІРґР°РЅРЅСЏ 11: y = %.12f%n", task11());
        System.out.printf(Locale.US, "Р—Р°РІРґР°РЅРЅСЏ 12: y = %.12f%n", task12());
    }

    // y = a^b / sh(|b|) + 4 * ln(c) / вЃґв€љd
    private static double task10() {
        double a = 1.27;
        double b = 10.99;
        double c = 2.73;
        double d = 25.32;

        return Math.pow(a, b) / Math.sinh(Math.abs(b))
                + 4.0 * Math.log(c) / Math.pow(d, 1.0 / 4.0);
    }

    // y = 9 * arcsin(a) / cos(в€љ|b|) + 2.43^d + ln(c)
    private static double task11() {
        double a = 0.478;
        double b = -1.26;
        double c = 2.68;
        double d = 18.24;

        return 9.0 * Math.asin(a) / Math.cos(Math.sqrt(Math.abs(b)))
                + Math.pow(2.43, d)
                + Math.log(c);
    }

    // y = 6 * (sin(|2a|))^lg(b) + в€љ(c * ch(-d))
    private static double task12() {
        double a = 1.478;
        double b = 9.26;
        double c = 0.68;
        double d = 2.24;

        return 6.0 * Math.pow(Math.sin(Math.abs(2.0 * a)), Math.log10(b))
                + Math.sqrt(c * Math.cosh(-d));
    }
}
