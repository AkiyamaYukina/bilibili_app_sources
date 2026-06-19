package com.bilibili.studio.material;

import com.bilibili.studio.material.internal.EngineType;
import com.bilibili.studio.material.internal.ProcessorItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/MaterialRequest.class */
public final class MaterialRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<Request> f108468a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public String f108469b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public EngineType f108470c = EngineType.Montage;

    @NotNull
    public final MaterialRequest add(@NotNull Request request) {
        if (request.getBizFrom().length() == 0) {
            request.setBizFrom(this.f108469b);
        }
        ((ArrayList) this.f108468a).add(request);
        return this;
    }

    @NotNull
    public final MaterialRequest bizFrom(@NotNull String str) {
        this.f108469b = str;
        Iterator<T> it = this.f108468a.iterator();
        while (it.hasNext()) {
            ((Request) it.next()).setBizFrom(str);
        }
        return this;
    }

    @NotNull
    public final MaterialRequest copy() {
        MaterialRequest materialRequest = new MaterialRequest();
        materialRequest.f108469b = this.f108469b;
        materialRequest.f108470c = this.f108470c;
        Iterator<T> it = this.f108468a.iterator();
        while (it.hasNext()) {
            materialRequest.add(Request.copyRequest$default((Request) it.next(), null, null, null, null, null, null, null, null, null, null, null, null, 4095, null));
        }
        return materialRequest;
    }

    @NotNull
    public final MaterialRequest dirFilterBlackList(@NotNull List<String> list) {
        Iterator<T> it = this.f108468a.iterator();
        while (it.hasNext()) {
            ((Request) it.next()).getDirFilterBlackList$resourcecenter_release().addAll(list);
        }
        return this;
    }

    @NotNull
    public final MaterialRequest engineType(@NotNull EngineType engineType) {
        this.f108470c = engineType;
        Iterator<T> it = this.f108468a.iterator();
        while (it.hasNext()) {
            ((Request) it.next()).setEngineType(engineType);
        }
        return this;
    }

    @NotNull
    public final MaterialRequest extraStrategies(@NotNull List<? extends IStrategy<ProcessorItem>> list) {
        Iterator<T> it = this.f108468a.iterator();
        while (it.hasNext()) {
            ((Request) it.next()).setExtraStrategy$resourcecenter_release(list);
        }
        return this;
    }

    @NotNull
    public final String getBizFrom() {
        return this.f108469b;
    }

    @NotNull
    public final EngineType getEngineType() {
        return this.f108470c;
    }

    @NotNull
    public final List<Request> getRequests() {
        return this.f108468a;
    }

    @NotNull
    public final MaterialRequest montageSupportMaterialTypes(@NotNull Set<String> set) {
        Iterator<T> it = this.f108468a.iterator();
        while (it.hasNext()) {
            ((Request) it.next()).setMontageSupportMaterialTypes$resourcecenter_release(set);
        }
        return this;
    }

    public final void setBizFrom(@NotNull String str) {
        this.f108469b = str;
    }

    public final void setEngineType(@NotNull EngineType engineType) {
        this.f108470c = engineType;
    }
}
