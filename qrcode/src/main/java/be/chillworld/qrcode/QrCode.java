package be.chillworld.qrcode;

import org.zkoss.zk.ui.ext.AfterCompose;
import org.zkoss.zul.Label;

/**
 *
 * @author cossaer.f
 */
public class QrCode extends Label implements AfterCompose {

    public void afterCompose() {
        this.setClientAttribute("data-qrcode", "");
    }

}
