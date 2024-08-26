package com.RecyclerViewAnimation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

import java.util.ArrayList;


public class Adapter_Property extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


    private ArrayList<Property> properties;

    public Adapter_Property(ArrayList<Property> properties) {
        this.properties = properties;
    }

    public int getItemCount() {
        return properties == null ? 0 : properties.size();
    }

    @Override
    public int getItemViewType(int position) {
        return properties.get(position).getType();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == 0) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_property, parent, false);
            PropertyViewHolder myViewHolder = new PropertyViewHolder(view);
            return myViewHolder;
        } else {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_project, parent, false);
            ProjectViewHolder myViewHolder = new ProjectViewHolder(view);
            return myViewHolder;
        }


    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int listPosition) {
        Property property = properties.get(listPosition);


        if (holder instanceof PropertyViewHolder) {
            PropertyViewHolder mHolder = (PropertyViewHolder) holder;
            String image = property.getImages().get(0);
            Imager.me().imageByDrawableName(mHolder.property_IMG_image, image);

            // to make card change on scroll should be here
            // if we dont load in onBindViewHolder the anim will be only when the RV pop up
//            mHolder.itemView.startAnimation(AnimationUtils.loadAnimation(mHolder.itemView.getContext(), R.anim.rotate_in_animation));

            mHolder.property_LBL_address.setText(property.getAddress());
            mHolder.property_LBL_price.setText(property.getPrice() + "₪");
        } else if (holder instanceof ProjectViewHolder) {
            ProjectViewHolder mHolder = (ProjectViewHolder) holder;
            Imager.me().imageByDrawableName(mHolder.project_IMG_image, property.getImages().get(0));
            Imager.me().imageByDrawableName(mHolder.project_IMG_image1, property.getImages().get(1));
            Imager.me().imageByDrawableName(mHolder.project_IMG_image2, property.getImages().get(2));
            Imager.me().imageByDrawableName(mHolder.project_IMG_image3, property.getImages().get(3));
            Imager.me().imageByDrawableName(mHolder.project_IMG_logo, property.getSellerIcon());



            mHolder.project_LBL_address.setText(property.getAddress());
            mHolder.project_LBL_content.setText(property.getContent());

        }
    }


    class PropertyViewHolder extends RecyclerView.ViewHolder {

        public AppCompatImageView property_IMG_image;
        public MaterialTextView property_LBL_address;
        public MaterialTextView property_LBL_rooms;
        public MaterialTextView property_LBL_area;
        public MaterialTextView property_LBL_price;
        public AppCompatImageView property_IMG_balcony;
        public AppCompatImageView property_IMG_parking;

        public PropertyViewHolder(View itemView) {
            super(itemView);
            property_IMG_image = itemView.findViewById(R.id.property_IMG_image);
            property_LBL_address = itemView.findViewById(R.id.property_LBL_address);
            property_LBL_rooms = itemView.findViewById(R.id.property_LBL_rooms);
            property_LBL_area = itemView.findViewById(R.id.property_LBL_area);
            property_LBL_price = itemView.findViewById(R.id.property_LBL_price);
            property_IMG_balcony = itemView.findViewById(R.id.property_IMG_balcony);
            property_IMG_parking = itemView.findViewById(R.id.property_IMG_parking);
        }

    }

    class ProjectViewHolder extends RecyclerView.ViewHolder {

        public AppCompatImageView project_IMG_logo;
        public AppCompatImageView project_IMG_image;
        public AppCompatImageView project_IMG_image1;
        public AppCompatImageView project_IMG_image2;
        public AppCompatImageView project_IMG_image3;
        public MaterialTextView project_LBL_address;
        public MaterialTextView project_LBL_content;
        public MaterialButton project_BTN_action;

        public ProjectViewHolder(View itemView) {
            super(itemView);
            project_IMG_logo = itemView.findViewById(R.id.project_IMG_logo);
            project_IMG_image = itemView.findViewById(R.id.project_IMG_image);
            project_IMG_image1 = itemView.findViewById(R.id.project_IMG_image1);
            project_IMG_image2 = itemView.findViewById(R.id.project_IMG_image2);
            project_IMG_image3 = itemView.findViewById(R.id.project_IMG_image3);
            project_LBL_address = itemView.findViewById(R.id.project_LBL_address);
            project_LBL_content = itemView.findViewById(R.id.project_LBL_content);
            project_BTN_action = itemView.findViewById(R.id.project_BTN_action);
        }



    }
}
