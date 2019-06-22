package com.harrykbd.safe.cvdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class EffectListAdapter extends RecyclerView.Adapter<EffectListAdapter.MyViewHolder> {
    Context mContext;
    final String[] mList;

    public EffectListAdapter(final String[] effects, Context context) {
        super();
        mContext = context;
        mList = effects;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.effect_item, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        holder.mTextView.setText(mList[position]);

        holder.mTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String list = mList[position];
                Toast.makeText(mContext, list, Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return mList.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView mTextView;
        public MyViewHolder(View view) {
            super(view);
            mTextView=(TextView) view.findViewById(R.id.effect_name);
        }
    }
}
