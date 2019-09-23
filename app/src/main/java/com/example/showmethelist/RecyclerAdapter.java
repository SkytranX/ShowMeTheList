package com.example.showmethelist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.PeopleViewHolder> {

    private List<Person> peopleList;

    public RecyclerAdapter(List<Person> peopleList) {
        this.peopleList = peopleList;

    }

    @NonNull
    @Override
    public PeopleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(
               R.layout.person_item,
               parent,
               false
       );
        return new PeopleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PeopleViewHolder holder, int position) {
        Person person = peopleList.get(position);

        String firstName = person.getFirstName();
        String lastName = person.getLastName();
        holder.tvName.setText(firstName +" "+ lastName);
//        String lastName = person.getLastName();
//        holder.tvName.setText(lastName);

        String phone = person.getPhoneNumber();
        holder.userPhone.setText(phone);

        String email = person.getEmail();
        holder.userEmail.setText(email);

    }

    @Override
    public int getItemCount() {
        return peopleList.size();
    }

    class PeopleViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        TextView userPhone;
        TextView userEmail;

        public PeopleViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvName);
            userPhone = itemView.findViewById(R.id.info_phone);
            userEmail = itemView.findViewById(R.id.info_email);

        }
    }
}
