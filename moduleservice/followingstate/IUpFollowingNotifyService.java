package com.bilibili.moduleservice.followingstate;

import android.util.LongSparseArray;
import androidx.lifecycle.Observer;
import com.bilibili.base.INotifyService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/moduleservice/followingstate/IUpFollowingNotifyService.class */
public interface IUpFollowingNotifyService extends INotifyService<UpData, Observer<LongSparseArray<UpData>>> {
}
