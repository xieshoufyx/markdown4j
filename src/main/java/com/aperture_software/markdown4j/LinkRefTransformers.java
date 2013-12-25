package com.aperture_software.markdown4j;

import com.github.rjeschke.txtmark.LinkRef;

import java.util.List;

/**
 * Created by jhyun on 13. 12. 25.
 */
public class LinkRefTransformers {

    public static LinkRef apply(final List<LinkRefTransformer> linkRefTransformers, final LinkRef linkRef)
            throws CloneNotSupportedException {
        LinkRef cur = (LinkRef) linkRef.clone();
        for(LinkRefTransformer lrt : linkRefTransformers) {
            cur = lrt.transform(cur);
        }
        return cur;
    }

}
