package se.melindasw.poetrygenerator.services;

import org.springframework.stereotype.Service;
import se.melindasw.poetrygenerator.exceptions.HaikuGeneratorException;
import se.melindasw.poetrygenerator.haiku.Haiku;

public interface HaikuGeneratorService {
    Haiku generateHaiku(String text) throws HaikuGeneratorException;
}
