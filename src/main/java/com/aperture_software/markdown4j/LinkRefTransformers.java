package com.aperture_software.markdown4j;

import com.github.rjeschke.txtmark.LinkRef;

import java.util.List;

/**
 * Created by jhyun on 13. 12. 25.
 */
public class LinkRefTransformers {

    public static String apply(final List<LinkRefTransformer> linkRefTransformers, final String link) {
        String s = new String(link);
        for(LinkRefTransformer lrt : linkRefTransformers) {
            s = lrt.transform(s);
        }
        return s;
    }

}
