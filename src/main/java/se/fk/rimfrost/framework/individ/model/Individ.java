package se.fk.rimfrost.framework.individ.model;

import org.immutables.value.Value;

import java.util.UUID;

@Value.Immutable
public interface Individ
{
   UUID id();

   String typ();

   String varde();
}
