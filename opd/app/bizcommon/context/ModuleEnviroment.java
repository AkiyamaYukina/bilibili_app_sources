package com.bilibili.opd.app.bizcommon.context;

import android.app.Application;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/context/ModuleEnviroment.class */
public abstract class ModuleEnviroment extends Environment {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Module f73523g;

    public ModuleEnviroment(Module module, Application application, String str) {
        this(module, application, str, null);
    }

    public ModuleEnviroment(Module module, Application application, String str, String str2) {
        super(application, module, str);
        this.f73523g = module;
    }

    public Module getModule() {
        return this.f73523g;
    }

    public String getModuleName() {
        return "";
    }
}
