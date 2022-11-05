import javax.swing.*;

public class Jpanel {

    public void panel() {
        JpanelEnvironment jPanelEnvironment = new JpanelEnvironment();

        int n = JOptionPane.showConfirmDialog(null, "Seyehat için güzel bir gün.\nHadi uçak bileti bakalım.\nBugüne özel \n0-12 Yaş %50 indirim\n12-24 Yaş %10 indirim\n65 Yaş Üstü %30 indirim", "UmutJet", JOptionPane.YES_NO_OPTION);

        if (n == JOptionPane.YES_OPTION)
        {
            jPanelEnvironment.environment();
        }
        else if (n == JOptionPane.NO_OPTION)
        {
            System.exit(n);
        }


    }
}
