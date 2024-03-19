package com.sometri.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

public class StudentAdapter extends ArrayAdapter<Student> {
    private Context mContext;
    private List<Student> mStudents;

    public StudentAdapter(Context context, List<Student> students) {
        super(context, 0, students);
        mContext = context;
        mStudents = students;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = convertView;
        ViewHolder holder;

        if (rowView == null) {
            LayoutInflater inflater = LayoutInflater.from(mContext);
            rowView = inflater.inflate(R.layout.list_item_student, parent, false);

            holder = new ViewHolder();
            holder.textName = rowView.findViewById(R.id.textName);
            holder.textRollNumber = rowView.findViewById(R.id.textRollNumber);
            holder.textGrade = rowView.findViewById(R.id.textGrade);

            rowView.setTag(holder);
        } else {
            holder = (ViewHolder) rowView.getTag();
        }

        Student student = mStudents.get(position);
        holder.textName.setText(student.getName());
        holder.textRollNumber.setText(String.valueOf(student.getRollNumber()));
        holder.textGrade.setText(student.getGrade());

        return rowView;
    }

    static class ViewHolder {
        TextView textName;
        TextView textRollNumber;
        TextView textGrade;
    }
}
