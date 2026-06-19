package com.bilibili.sistersplayer.hls;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/hls/Hls7Player$competitionM3U8$1$fetchBack$1.class */
public final class Hls7Player$competitionM3U8$1$fetchBack$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super FetchResult<String>>, Object> {
    final String $backM3U8;
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final Hls7Player this$0;

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.hls.Hls7Player$competitionM3U8$1$fetchBack$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/hls/Hls7Player$competitionM3U8$1$fetchBack$1$1.class */
    public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function0<Boolean> {
        public AnonymousClass1(Object obj) {
            super(0, obj, Hls7Player.class, "canRetry", "canRetry()Z", 0);
        }

        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final Boolean m9718invoke() {
            return Boolean.valueOf(((Hls7Player) ((CallableReference) this).receiver).canRetry());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Hls7Player$competitionM3U8$1$fetchBack$1(Hls7Player hls7Player, String str, Continuation<? super Hls7Player$competitionM3U8$1$fetchBack$1> continuation) {
        super(2, continuation);
        this.this$0 = hls7Player;
        this.$backM3U8 = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Hls7Player$competitionM3U8$1$fetchBack$1(this.this$0, this.$backM3U8, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super FetchResult<String>> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    public final java.lang.Object invokeSuspend(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r14v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:407)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:303)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
        	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:88)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
}
