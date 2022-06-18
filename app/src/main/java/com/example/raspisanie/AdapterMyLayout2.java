package com.example.raspisanie;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.raspisanie.mylayout2model;
import com.example.raspisanie.R;


import java.util.List;

public class AdapterMyLayout2 extends RecyclerView.Adapter<AdapterMyLayout2.ViewholderPerson> {
    private Context context;
    private List<mylayout2model> list;

    public AdapterMyLayout2(Context context, List<mylayout2model> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewholderPerson onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.mylayout2, parent, false);
        return new ViewholderPerson(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewholderPerson holder, int position) {
        mylayout2model myLayout2Model = list.get(position);

        holder.day.setText(myLayout2Model.getDay());
        holder.where.setText(myLayout2Model.getWhere());
        holder.name1.setText(myLayout2Model.getName1());
        holder.name2.setText(myLayout2Model.getName2());
        holder.name3.setText(myLayout2Model.getName3());
        holder.name4.setText(myLayout2Model.getName4());
        holder.name5.setText(myLayout2Model.getName5());
        holder.name6.setText(myLayout2Model.getName6());
        holder.name7.setText(myLayout2Model.getName7());
        holder.name8.setText(myLayout2Model.getName8());
        holder.name9.setText(myLayout2Model.getName9());
        holder.name10.setText(myLayout2Model.getName10());
        if (holder.name2.getText() == "") holder.name2.setVisibility(View.GONE);
        if (holder.name4.getText() == "") holder.name4.setVisibility(View.GONE);
        if (holder.name6.getText() == "") holder.name6.setVisibility(View.GONE);
        if (holder.name8.getText() == "") holder.name8.setVisibility(View.GONE);
        if (holder.name10.getText() == "") holder.name10.setVisibility(View.GONE);
        if (holder.where.getText() == "") holder.where.setVisibility(View.GONE);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewholderPerson extends RecyclerView.ViewHolder {

        private TextView day, where, name1, name2, name3, name4, name5, name6, name7, name8, name9, name10;

        public ViewholderPerson(@NonNull View itemView) {
            super(itemView);

            day = itemView.findViewById(R.id.textView);
            where = itemView.findViewById(R.id.textView2);
            name1 = itemView.findViewById(R.id.textView4);
            name2 = itemView.findViewById(R.id.textView5);
            name3 = itemView.findViewById(R.id.textView7);
            name4 = itemView.findViewById(R.id.textView8);
            name5 = itemView.findViewById(R.id.textView10);
            name6 = itemView.findViewById(R.id.textView11);
            name7 = itemView.findViewById(R.id.textView13);
            name8 = itemView.findViewById(R.id.textView14);
            name9 = itemView.findViewById(R.id.textView16);
            name10 = itemView.findViewById(R.id.textView17);
        }
    }
}