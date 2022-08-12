package com.uni.flyway;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.util.CollectionUtils;

public class TopicService {
	
	private Map<String, Object> propertyMap = new HashMap<>();
	
	/*
	 * public void addPartition(String topicName, int numOfPartitions) { if
	 * (numOfPartitions < 0) throw new
	 * Exception("Partition Count Can't be less than 1 for Topic:"+topicName);
	 * 
	 * try (AdminClient adminClient = AdminClient.create(getProperties())) {
	 * List<Integer> topicList = getListOfPartitions(topicName);
	 * 
	 * Map<String, NewPartitions> newPartitionMap = new HashMap<>();
	 * newPartitionMap.put(topicName, NewPartitions.increaseTo(topicList.size() +
	 * numOfPartitions));
	 * 
	 * adminClient.createPartitions(newPartitionMap);
	 * 
	 * } catch (Exception e) { throw new
	 * Exception("Connecton With Zookeeper/kafka Failed while adding partition for Topic:"
	 * +topicName); } }
	 * 
	 * 
	 * private Map<String, Object> getProperties() throws Exception { if
	 * (CollectionUtils.isEmpty(this.propertyMap)) throw new
	 * Exception("Configuration Properties Map can't be empty"); return
	 * this.propertyMap; }
	 */

	public void setProperties(Map<String, Object> props) throws Exception {

		if (CollectionUtils.isEmpty(props))
			throw new Exception("Configuration Properties Map can't be empty");

		this.propertyMap = props;
	}
	
	/*
	 * public List<Integer> getListOfPartitions(String topicName) throws Exception {
	 * List<Integer> topicList = Lists.newArrayList(); try (AdminClient adminClient
	 * = AdminClient.create(getProperties())) { DescribeTopicsResult topicResult =
	 * adminClient.describeTopics(Lists.newArrayList(topicName)); if
	 * (!CollectionUtils.isEmpty(topicResult.all().get())) { Map<String,
	 * TopicDescription> _map = topicResult.all().get(); System.out.println(
	 * "Map fetched is -----> {}"+ _map); topicList =
	 * _map.get(topicName).partitions().stream().map(p -> p.partition())
	 * .collect(Collectors.toList()); } } catch (Exception e) {
	 * logger.error(this.getClass(),
	 * "Exception while Fetching List of Partitons of Topic", e); throw new
	 * Exception("Exception while Fetching List of Partitons of Topic ," +
	 * topicName);
	 * 
	 * } return topicList; }
	 */

}
