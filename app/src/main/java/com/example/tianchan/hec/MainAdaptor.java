package com.example.tianchan.hec;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

import java.util.List;

/**
 * Created by Tianchan on 16-Feb-18.
 */

public class MainAdaptor extends RecyclerView.Adapter<MainAdaptor.ProfileViewHolder> {

    private List<ProfileData> users;

    public MainAdaptor(List<ProfileData> users) {
        this.users = users;
    }

    public class ProfileViewHolder extends RecyclerView.ViewHolder {
        public TextView profileDescription;
        public ImageView profileImage;

        public ProfileViewHolder(View view) {
            super(view);
            profileImage = view.findViewById(R.id.profile_image_set);
            profileDescription = view.findViewById(R.id.profile_description);
        }
    }

    @Override
    public ProfileViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.
                from(viewGroup.getContext()).
                inflate(R.layout.fragment_single_profile, viewGroup, false);

        return new ProfileViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ProfileViewHolder profileViewHolder, int i) {
        ProfileData person = users.get(i);
        profileViewHolder.profileDescription.setText(person.introduction);
    }

    @Override
    public int getItemCount() {
        return users.size();
    }
}
