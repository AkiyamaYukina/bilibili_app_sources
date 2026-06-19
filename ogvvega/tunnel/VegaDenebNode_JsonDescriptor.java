package com.bilibili.ogvvega.tunnel;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvvega/tunnel/VegaDenebNode_JsonDescriptor.class */
public final class VegaDenebNode_JsonDescriptor extends PojoClassDescriptor {
    private static final PojoPropertyDescriptor[] properties = createProperties();

    public VegaDenebNode_JsonDescriptor() {
        super(VegaDenebNode.class, properties);
    }

    private static PojoPropertyDescriptor[] createProperties() {
        return new PojoPropertyDescriptor[]{new PojoPropertyDescriptor("host", (String[]) null, String.class, (Class) null, 1), new PojoPropertyDescriptor("port", (String[]) null, Integer.TYPE, (Class) null, 1)};
    }

    public Object constructWith(Object[] objArr) {
        int iIntValue = 0;
        String str = (String) objArr[0];
        Integer num = (Integer) objArr[1];
        if (num != null) {
            iIntValue = num.intValue();
        }
        return new VegaDenebNode(str, iIntValue);
    }

    public Object get(Object obj, int i7) {
        VegaDenebNode vegaDenebNode = (VegaDenebNode) obj;
        if (i7 == 0) {
            return vegaDenebNode.getHost();
        }
        if (i7 != 1) {
            return null;
        }
        return Integer.valueOf(vegaDenebNode.getPort());
    }
}
