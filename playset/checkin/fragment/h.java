package com.bilibili.playset.checkin.fragment;

import android.os.Bundle;
import android.widget.ImageView;
import androidx.lifecycle.Observer;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.playset.checkin.CheckInHistory;
import com.bilibili.playset.checkin.CheckInHistoryFooter;
import com.bilibili.playset.checkin.HistoryPage;
import com.bilibili.playset.topic.CollectionTopicItem;
import com.bilibili.playset.topic.CollectionTopicSubFragment;
import com.bilibili.playset.topic.RspCollectionTopic;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import xs0.m;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/checkin/fragment/h.class */
public final /* synthetic */ class h implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f84206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BaseFragment f84207b;

    public /* synthetic */ h(BaseFragment baseFragment, int i7) {
        this.f84206a = i7;
        this.f84207b = baseFragment;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        Integer hasMore;
        Integer hasMore2;
        Integer pageIndex;
        switch (this.f84206a) {
            case 0:
                Pair pair = (Pair) obj;
                int iIntValue = ((Number) pair.getFirst()).intValue();
                CheckInHistoryFragment checkInHistoryFragment = (CheckInHistoryFragment) this.f84207b;
                if (iIntValue == 0) {
                    checkInHistoryFragment.showLoading();
                    checkInHistoryFragment.f84185d = true;
                    break;
                } else if (iIntValue == 1) {
                    checkInHistoryFragment.hideLoading();
                    checkInHistoryFragment.f84185d = false;
                    if (pair.getSecond() != null) {
                        CheckInHistory checkInHistory = (CheckInHistory) pair.getSecond();
                        if ((checkInHistory != null ? checkInHistory.getList() : null) != null) {
                            CheckInHistory checkInHistory2 = (CheckInHistory) pair.getSecond();
                            if (checkInHistory2 != null && checkInHistory2.getList() != null) {
                                CheckInHistory checkInHistory3 = (CheckInHistory) pair.getSecond();
                                HistoryPage page = checkInHistory3.getPage();
                                checkInHistoryFragment.f84187f = (page == null || (hasMore2 = page.getHasMore()) == null || hasMore2.intValue() != 1) ? false : true;
                                ArrayList arrayList = new ArrayList();
                                arrayList.addAll(checkInHistory3.getList());
                                HistoryPage page2 = checkInHistory3.getPage();
                                if (page2 != null && (hasMore = page2.getHasMore()) != null && hasMore.intValue() == 0) {
                                    Long completeCount = checkInHistory3.getCompleteCount();
                                    long jLongValue = completeCount != null ? completeCount.longValue() : 0L;
                                    Long totalDuration = checkInHistory3.getTotalDuration();
                                    arrayList.add(new CheckInHistoryFooter(jLongValue, totalDuration != null ? totalDuration.longValue() : 0L));
                                }
                                Zr0.e eVar = (Zr0.e) checkInHistoryFragment.f84186e.getValue();
                                if (eVar.f29747a.isEmpty()) {
                                    eVar.f29747a.clear();
                                    eVar.f29747a.addAll(arrayList);
                                    eVar.notifyDataSetChanged();
                                    break;
                                } else if (!arrayList.isEmpty()) {
                                    int size = eVar.f29747a.size();
                                    eVar.f29747a.addAll(arrayList);
                                    eVar.notifyItemRangeInserted(size, eVar.f29747a.size());
                                    break;
                                }
                            }
                        }
                    }
                    checkInHistoryFragment.showEmptyTips();
                    break;
                } else if (iIntValue == 2) {
                    checkInHistoryFragment.hideLoading();
                    checkInHistoryFragment.f84185d = false;
                    checkInHistoryFragment.showErrorTips();
                    break;
                }
                break;
            default:
                Bundle bundle = (Bundle) obj;
                String string = bundle.getString("key_from");
                CollectionTopicSubFragment collectionTopicSubFragment = (CollectionTopicSubFragment) this.f84207b;
                if (Intrinsics.areEqual(string, collectionTopicSubFragment.f85623f)) {
                    int i7 = bundle.getInt("key_status");
                    if (i7 == 0) {
                        collectionTopicSubFragment.setRefreshStart();
                        ImageView imageView = collectionTopicSubFragment.f85630n;
                        if (imageView != null) {
                            imageView.setVisibility(8);
                        }
                        TintTextView tintTextView = collectionTopicSubFragment.f85629m;
                        if (tintTextView != null) {
                            tintTextView.setVisibility(8);
                        }
                        collectionTopicSubFragment.f85624g = true;
                        break;
                    } else if (i7 == 1) {
                        collectionTopicSubFragment.setRefreshCompleted();
                        collectionTopicSubFragment.kf(2131232151, 2131841340);
                        break;
                    } else if (i7 == 2) {
                        collectionTopicSubFragment.setRefreshCompleted();
                        RspCollectionTopic rspCollectionTopic = (RspCollectionTopic) bundle.getParcelable("key_data");
                        List<CollectionTopicItem> items = rspCollectionTopic != null ? rspCollectionTopic.getItems(collectionTopicSubFragment.f85623f) : null;
                        collectionTopicSubFragment.f85624g = (items != null ? items.size() : 0) >= 20;
                        collectionTopicSubFragment.f85625i = (rspCollectionTopic == null || (pageIndex = rspCollectionTopic.getPageIndex(collectionTopicSubFragment.f85623f)) == null) ? 1 : pageIndex.intValue();
                        if (!(items != null && (items.isEmpty() ^ true))) {
                            m mVar = collectionTopicSubFragment.f85626j;
                            if (mVar != null) {
                                ((ArrayList) mVar.f129469g).clear();
                                mVar.notifyDataSetChanged();
                            }
                            collectionTopicSubFragment.kf(2131235613, 2131842626);
                        } else {
                            collectionTopicSubFragment.jf(items, false);
                            if (!collectionTopicSubFragment.f85624g) {
                                m mVar2 = collectionTopicSubFragment.f85626j;
                                if (mVar2 != null) {
                                    mVar2.N(3);
                                }
                            } else {
                                m mVar3 = collectionTopicSubFragment.f85626j;
                                if (mVar3 != null) {
                                    mVar3.N(2);
                                }
                            }
                        }
                        break;
                    }
                }
                break;
        }
    }
}
