package com.bilibili.live.streaming.utils;

import com.bilibili.live.streaming.log.LivePusherLog;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/utils/BObjectPool.class */
public abstract class BObjectPool<T> {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final String TAG = "BObjectPool";
    private int mFreeLinkListLength = 64;

    @NotNull
    private FreeLinkList<T> freeNodeList = new FreeLinkList<>();

    @NotNull
    private FreeLinkList<T> freeObjectList = new FreeLinkList<>();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/utils/BObjectPool$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getTAG() {
            return BObjectPool.TAG;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/utils/BObjectPool$FreeLinkList.class */
    public static final class FreeLinkList<T> {

        @NotNull
        private AtomicReference<Node<T>> freeNodes = new AtomicReference<>(null);

        @NotNull
        private AtomicInteger freeNodeCount = new AtomicInteger(0);

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/utils/BObjectPool$FreeLinkList$Node.class */
        public static class Node<T> {

            @Nullable
            private T data;

            @Nullable
            private Node<T> next;

            @Nullable
            public T getData() {
                return this.data;
            }

            @Nullable
            public Node<T> getNext() {
                return this.next;
            }

            public void setData(@Nullable T t7) {
                this.data = t7;
            }

            public void setNext(@Nullable Node<T> node) {
                this.next = node;
            }
        }

        public final int getLength() {
            return this.freeNodeCount.get();
        }

        @Nullable
        public final Node<T> popFreeNode() {
            int i7;
            while (true) {
                Node<T> node = this.freeNodes.get();
                if (node == null) {
                    return null;
                }
                AtomicReference<Node<T>> atomicReference = this.freeNodes;
                Node<T> next = node.getNext();
                while (!atomicReference.compareAndSet(node, next)) {
                    if (atomicReference.get() != node) {
                        break;
                    }
                }
                do {
                    i7 = this.freeNodeCount.get();
                } while (!this.freeNodeCount.compareAndSet(i7, i7 - 1));
                node.setNext(null);
                return node;
            }
        }

        public final void pushFreeNode(@NotNull Node<T> node) {
            int i7;
            while (true) {
                node.setNext(this.freeNodes.get());
                AtomicReference<Node<T>> atomicReference = this.freeNodes;
                Node<T> next = node.getNext();
                while (!atomicReference.compareAndSet(next, node)) {
                    if (atomicReference.get() != next) {
                        break;
                    }
                }
            }
            do {
                i7 = this.freeNodeCount.get();
            } while (!this.freeNodeCount.compareAndSet(i7, i7 + 1));
        }
    }

    public abstract T construct();

    public T getObject() {
        FreeLinkList.Node<T> nodePopFreeNode = this.freeObjectList.popFreeNode();
        if ((nodePopFreeNode != null ? nodePopFreeNode.getData() : null) == null) {
            return construct();
        }
        T data = nodePopFreeNode.getData();
        if (data == null) {
            LivePusherLog.e$default(TAG, "Internal error: Get null data node from freeObjectList!", null, 4, null);
            return construct();
        }
        nodePopFreeNode.setData(null);
        if (this.freeNodeList.getLength() < this.mFreeLinkListLength) {
            this.freeNodeList.pushFreeNode(nodePopFreeNode);
        }
        onReuse(data);
        return data;
    }

    public abstract void onReuse(T t7);

    public void releaseObject(T t7) {
        if (this.freeObjectList.getLength() < this.mFreeLinkListLength) {
            FreeLinkList.Node<T> nodePopFreeNode = this.freeNodeList.popFreeNode();
            FreeLinkList.Node<T> node = nodePopFreeNode;
            if (nodePopFreeNode == null) {
                node = new FreeLinkList.Node<>();
            }
            node.setData(t7);
            this.freeObjectList.pushFreeNode(node);
        }
    }
}
