package com.sample.MySampleProject;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface SimpleSourceDestinationMapper {
	@Mapping(source = "name", target = "name")
	@Mapping(source = "description", target = "description")
	SimpleDestination sourceToDestination(SimpleSource source);
	@Mapping(source = "name", target = "name")
	@Mapping(source = "description", target = "description")
	SimpleSource destinationToSource(SimpleDestination destination);
}