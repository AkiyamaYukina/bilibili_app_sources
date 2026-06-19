package com.bilibili.opd.app.bizcommon.malldynamic.core;

import G0.b;
import androidx.annotation.Keep;
import h6.C7416u;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/malldynamic/core/TemplateNode.class */
@Keep
public final class TemplateNode {

    @Nullable
    private Map<String, String> attribute;

    @Nullable
    private List<TemplateNode> children;

    @Nullable
    private Map<String, String> layout;

    @Nullable
    private String name;

    @Nullable
    private String templateData;

    @Nullable
    private String type;

    public TemplateNode() {
        this(null, null, null, null, null, null, 63, null);
    }

    public TemplateNode(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Map<String, String> map, @Nullable Map<String, String> map2, @Nullable List<TemplateNode> list) {
        this.name = str;
        this.type = str2;
        this.templateData = str3;
        this.layout = map;
        this.attribute = map2;
        this.children = list;
    }

    public /* synthetic */ TemplateNode(String str, String str2, String str3, Map map, Map map2, List list, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : str3, (i7 & 8) != 0 ? null : map, (i7 & 16) != 0 ? null : map2, (i7 & 32) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TemplateNode copy$default(TemplateNode templateNode, String str, String str2, String str3, Map map, Map map2, List list, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = templateNode.name;
        }
        if ((i7 & 2) != 0) {
            str2 = templateNode.type;
        }
        if ((i7 & 4) != 0) {
            str3 = templateNode.templateData;
        }
        if ((i7 & 8) != 0) {
            map = templateNode.layout;
        }
        if ((i7 & 16) != 0) {
            map2 = templateNode.attribute;
        }
        if ((i7 & 32) != 0) {
            list = templateNode.children;
        }
        return templateNode.copy(str, str2, str3, map, map2, list);
    }

    @Nullable
    public final String component1() {
        return this.name;
    }

    @Nullable
    public final String component2() {
        return this.type;
    }

    @Nullable
    public final String component3() {
        return this.templateData;
    }

    @Nullable
    public final Map<String, String> component4() {
        return this.layout;
    }

    @Nullable
    public final Map<String, String> component5() {
        return this.attribute;
    }

    @Nullable
    public final List<TemplateNode> component6() {
        return this.children;
    }

    @NotNull
    public final TemplateNode copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Map<String, String> map, @Nullable Map<String, String> map2, @Nullable List<TemplateNode> list) {
        return new TemplateNode(str, str2, str3, map, map2, list);
    }

    public boolean equals(@Nullable Object obj) {
        TemplateNode templateNode = obj instanceof TemplateNode ? (TemplateNode) obj : null;
        boolean z6 = false;
        if (templateNode != null) {
            z6 = false;
            if (templateNode.hashCode() == hashCode()) {
                z6 = true;
            }
        }
        return z6;
    }

    @Nullable
    public final Map<String, String> getAttribute() {
        return this.attribute;
    }

    @Nullable
    public final List<TemplateNode> getChildren() {
        return this.children;
    }

    @Nullable
    public final Map<String, String> getLayout() {
        return this.layout;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getTemplateData() {
        return this.templateData;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = 0;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.type;
        int iHashCode3 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.templateData;
        int iHashCode4 = str3 != null ? str3.hashCode() : 0;
        Map<String, String> map = this.layout;
        int iHashCode5 = map != null ? map.hashCode() : 0;
        Map<String, String> map2 = this.attribute;
        int iHashCode6 = map2 != null ? map2.hashCode() : 0;
        List<TemplateNode> list = this.children;
        if (list != null) {
            iHashCode = list.hashCode();
        }
        return ((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode) * 31;
    }

    public final void setAttribute(@Nullable Map<String, String> map) {
        this.attribute = map;
    }

    public final void setChildren(@Nullable List<TemplateNode> list) {
        this.children = list;
    }

    public final void setLayout(@Nullable Map<String, String> map) {
        this.layout = map;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setTemplateData(@Nullable String str) {
        this.templateData = str;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    @NotNull
    public String toString() {
        String str = this.name;
        String str2 = this.type;
        String str3 = this.templateData;
        Map<String, String> map = this.layout;
        Map<String, String> map2 = this.attribute;
        List<TemplateNode> list = this.children;
        StringBuilder sbA = b.a("TemplateNode(name=", str, ", type=", str2, ", templateData=");
        C7416u.a(sbA, str3, ", layout=", map, ", attribute=");
        sbA.append(map2);
        sbA.append(", children=");
        sbA.append(list);
        sbA.append(")");
        return sbA.toString();
    }
}
