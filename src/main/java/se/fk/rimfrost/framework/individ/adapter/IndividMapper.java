package se.fk.rimfrost.framework.individ.adapter;

import jakarta.enterprise.context.ApplicationScoped;
import se.fk.rimfrost.framework.individ.model.ImmutableIndivid;
import se.fk.rimfrost.framework.individ.model.Individ;
import se.fk.rimfrost.api.individ.jaxrsspec.controllers.generatedsource.model.GetIndividResponse;

@ApplicationScoped
public class IndividMapper
{
   public Individ toIndivid(GetIndividResponse apiResponse)
   {
      if (apiResponse == null)
      {
         return null;
      }

      return ImmutableIndivid.builder()
            .id(apiResponse.getId())
            .typ(apiResponse.getTyp())
            .varde(apiResponse.getVarde())
            .build();
   }

}
