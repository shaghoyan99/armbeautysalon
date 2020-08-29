package am.abscomman.service;

import am.abscomman.repository.OrderRepository;
import am.abscomman.repository.PicturesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PicturesService {

    private final PicturesRepository picturesRepo;
}
