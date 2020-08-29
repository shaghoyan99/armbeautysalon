package am.abscomman.service;

import am.abscomman.repository.ServiceRepository;
import am.abscomman.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ServService {

    private final ServiceRepository serviceRepo;
}
