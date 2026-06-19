package com.bilibili.studio.videoeditor.template;

import fD0.InterfaceC7041a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/template/r.class */
public final /* synthetic */ class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function4 f110147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BiliTemplateEngineManager f110148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f110149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Function1 f110150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Function2 f110151e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Function4 f110152f;

    public /* synthetic */ r(Function4 function4, BiliTemplateEngineManager biliTemplateEngineManager, String str, Function1 function1, Function2 function2, Function4 function42) {
        this.f110147a = function4;
        this.f110148b = biliTemplateEngineManager;
        this.f110149c = str;
        this.f110150d = function1;
        this.f110151e = function2;
        this.f110152f = function42;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [com.bilibili.studio.videoeditor.template.B] */
    /* JADX WARN: Type inference failed for: r0v20, types: [com.bilibili.studio.videoeditor.template.C] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object invoke(Object obj) {
        Unit unit;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        Function4 function4 = this.f110147a;
        String strD = "";
        if (zBooleanValue) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = "";
            InterfaceC7041a interfaceC7041a = this.f110148b.f109914e;
            if (interfaceC7041a != 0) {
                strD = interfaceC7041a.d(this.f110149c, new com.bilibili.lib.fasthybrid.B(this.f110151e, objectRef), new Function3(this.f110152f, objectRef) { // from class: com.bilibili.studio.videoeditor.template.B

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final Function4 f109908a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Ref.ObjectRef f109909b;

                    {
                        this.f109908a = function4;
                        this.f109909b = objectRef;
                    }

                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        Object obj5 = this.f109909b.element;
                        this.f109908a.invoke((String) obj2, obj5, (String) obj3, obj4);
                        return Unit.INSTANCE;
                    }
                }, new Function3(function4, objectRef) { // from class: com.bilibili.studio.videoeditor.template.C

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final Function4 f109920a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Ref.ObjectRef f109921b;

                    {
                        this.f109920a = function4;
                        this.f109921b = objectRef;
                    }

                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        Integer num = (Integer) obj3;
                        num.intValue();
                        Object obj5 = this.f109921b.element;
                        this.f109920a.invoke(obj5, (String) obj2, num, (String) obj4);
                        return Unit.INSTANCE;
                    }
                });
            }
            objectRef.element = strD;
            this.f110150d.invoke(strD);
            unit = Unit.INSTANCE;
        } else {
            function4.invoke("", "", -1, "checkTribeInstalledState fail");
            unit = Unit.INSTANCE;
        }
        return unit;
    }
}
