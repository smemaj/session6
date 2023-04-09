package lhind.internship.mapper;

import lhind.internship.model.dto.UserDetailsDTO;
import lhind.internship.model.entity.UserDetails;

public class UserDetailsMapper extends AbstractMapper<UserDetails, UserDetailsDTO>{
    @Override
    public UserDetails toEntity(UserDetailsDTO userDetailsDTO) {
        return null;
    }

    @Override
    public UserDetailsDTO toDto(UserDetails userDetails) {
        if(userDetails == null){
            return null;
        }
        UserDetailsDTO userDetailsDTO = new UserDetailsDTO();
        userDetailsDTO.setId(userDetails.getId());
        userDetailsDTO.setEmail(userDetails.getEmail());
        userDetailsDTO.setFirstName(userDetails.getFirstName());
        userDetailsDTO.setLastName(userDetails.getLastName());
        userDetailsDTO.setPhoneNumber(userDetails.getPhoneNumber());
        return userDetailsDTO;
    }
}
