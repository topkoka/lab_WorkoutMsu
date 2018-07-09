package com.aditep.workout.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.aditep.workout.databinding.ListTypeMuscleBinding;
import com.aditep.workout.dao.WorkoutTypedataDao;
import com.aditep.workout.view.MuscleListType;

public class MuscleTypeListAdapter extends BaseAdapter {


    WorkoutTypedataDao dao;
    ListTypeMuscleBinding binding;
    Context mContext;
    String[] strNameArr;
    int[] imageArr;

    public MuscleTypeListAdapter(Context context, String[] strNameArr, int[] imageArr) {
        this.mContext= context;
        this.strNameArr = strNameArr;
        this.imageArr = imageArr;
    }



    public int getCount() {
        return strNameArr.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public int getViewTypeCount() {
        return 6;
    }

    @Override
    public int getItemViewType(int position) {
        for (int i = 6; i < position; i++) {

        }
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        MuscleListType item;
        if ( view != null) {
            item = (MuscleListType) view;
            item.setNameText(strNameArr[position]);
            item.setImageUrl(imageArr[position]);

        }
        else
            item = new MuscleListType(viewGroup.getContext());
        item.setNameText(strNameArr[position]);
        item.setImageUrl(imageArr[position]);
        return  item;
    }
    }
