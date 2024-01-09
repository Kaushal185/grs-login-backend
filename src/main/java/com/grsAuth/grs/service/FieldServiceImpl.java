package com.grsAuth.grs.service;
import com.grsAuth.grs.entity.Field;
import com.grsAuth.grs.repository.FieldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class FieldServiceImpl implements FieldService{
    @Autowired
    private FieldRepository fieldRepository;
    @Override
    public List<Field> getAllFields() {
        return fieldRepository.findAll();
    }
    @Override
    public Optional<Field> getFieldById(long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Field> getMessageById(long id) {
        return fieldRepository.findById(id);

    }
    @Override
    public List<Field> demoMethod(){
        return fieldRepository.demoMethod();
    }

    @Override
    public List<Field> demoMethod2(Long id) {
        return fieldRepository.demoMethod2(id);
    }
    public Page<Field> getAllByPage(int page, int size) {
        return fieldRepository.findAll(PageRequest.of(page, size));
    }
    public boolean substringOcc(String str,String s){
        int i=0,j=s.length()-1;
        for(j=s.length()-1;j<str.length();j++){
            if(str.charAt(i) == s.charAt(0) && str.charAt(j) == s.charAt(s.length()-1)){
                int currInd = i;
                int k = 0;
                for(k=0;k<s.length();k++){
                    // if(currInd >= str.length())break;
                    if(s.charAt(k) == str.charAt(currInd)){
                        currInd++;
                    }
                    else{
                        break;
                    }
                }
                if(k == s.length()){
                    return true;
                }
            }
            i++;
        }
        return false;
    }
}
