package com.example.VaccNow.service;

import com.example.VaccNow.Util;
import com.example.VaccNow.repository.BranchRepository;
import com.vaccNow.api.ApiUtil;
import com.vaccNow.api.BranchApi;
import com.vaccNow.api.BranchApiDelegate;
import com.vaccNow.model.Branch;
import com.vaccNow.model.ScheduleRequest;
import com.vaccNow.model.Timeslot;
import com.vaccNow.model.Vaccine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class BranchApiDelegateImpl implements BranchApiDelegate {

    @Autowired
    BranchRepository branchRepository;

    /**
     * GET /branch : Retrieve all branch
     *
     * @return Retrieve (status code 200)
     *         or Bad Request (status code 400)
     * @see BranchApi#getAllBranches
     */
    public ResponseEntity<List<Branch>> getAllBranches() {
        List<com.example.VaccNow.model.Branch> list = branchRepository.findAll();
        return new ResponseEntity<>(Util.getBranchToDao(list),HttpStatus.OK);
    }

    /**
     * GET /branch/{branchId}/timeslot : Retrieve all timeslot for a specific branch
     *
     * @param branchId branch id (required)
     * @return Retrieve (status code 201)
     *         or Bad Request (status code 400)
     *         or General Error (status code 200)
     * @see BranchApi#getAllTimeslotForBranch
     */
    public ResponseEntity<List<Timeslot>> getAllTimeslotForBranch(String branchId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"slot\" : \"slot\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /branch/{branchId}/vaccine : Retrieve all vaccines for specific branch
     *
     * @param branchId Retrieve all vaccines for specific branch (required)
     * @return Retrieve (status code 201)
     *         or Bad Request (status code 400)
     *         or General Error (status code 200)
     * @see BranchApi#getAllVaccinesForBranch
     */
    public ResponseEntity<List<Vaccine>> getAllVaccinesForBranch(String branchId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"price\" : \"price\", \"name\" : \"name\", \"id\" : \"id\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /branch/{branchId}/timeslot/{timeslot} : Retrieve availabilty for a specific branch
     *
     * @param branchId branch id (required)
     * @param timeslot timeslot (required)
     * @return Retrieve (status code 201)
     *         or Bad Request (status code 400)
     *         or General Error (status code 200)
     * @see BranchApi#getTimeslotForBranch
     */
    public ResponseEntity<String> getTimeslotForBranch(String branchId,
                                                        String timeslot) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /branch/{branchId}/schedule : Vaccine
     *
     * @param branchId The branch id to schedule appointment (required)
     * @param scheduleRequest scheduleRequest payload (required)
     * @return *Created* content: application/json: schema: $ref:  (status code 201)
     *         or Bad Request (status code 400)
     *         or General Error (status code 200)
     * @see BranchApi#scheduleAppointment
     */
    public ResponseEntity<Void> scheduleAppointment(String branchId,
                                                     ScheduleRequest scheduleRequest) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
