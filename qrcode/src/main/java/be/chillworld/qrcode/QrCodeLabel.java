package be.chillworld.qrcode;

import org.zkoss.zk.ui.ext.AfterCompose;
import org.zkoss.zul.Label;

/**
 *
 * @author cossaer.f
 */
public class QrCodeLabel extends Label implements AfterCompose {

    @Override
    public void afterCompose() {
        this.setClientAttribute("data-qrcode-value", "value");
    }

}
